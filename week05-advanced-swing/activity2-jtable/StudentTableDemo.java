import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class StudentTableDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Database — JTable");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 500);
            frame.setLocationRelativeTo(null);

            String[] columns = {"ID", "Name", "Age", "Grade", "GPA"};
            // The PDF was missing this data array, so I added it for you!
            Object[][] data = {
                {101, "Alice Smith", 20, "A", 3.8},
                {102, "Bob Jones", 22, "B+", 3.2},
                {103, "Charlie Brown", 19, "C", 2.0},
                {104, "Diana Prince", 21, "A-", 3.6},
                {105, "Edward Norton", 23, "C-", 2.5},
                {106, "Fiona Gallagher", 20, "B", 3.0}
            };

            DefaultTableModel model = new DefaultTableModel(data, columns);
            JTable table = new JTable(model);
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            // Custom renderer for GPA column (index 4)
            table.getColumnModel().getColumn(4).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    if (!isSelected && value instanceof Double) {
                        double gpa = (Double) value;
                        if (gpa < 3.0) {
                            c.setForeground(Color.RED);
                        } else {
                            c.setForeground(Color.BLACK);
                        }
                    }
                    return c;
                }
            });

            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
            JButton addButton = new JButton("Add Student");
            JButton deleteButton = new JButton("Delete Selected");
            JButton clearButton = new JButton("Clear All");

            addButton.addActionListener(e -> {
                String name = JOptionPane.showInputDialog(frame, "Enter student name:");
                if (name == null || name.trim().isEmpty()) return;
                String ageStr = JOptionPane.showInputDialog(frame, "Enter age:");
                if (ageStr == null) return;
                String grade = JOptionPane.showInputDialog(frame, "Enter grade (e.g., A, B+):");
                if (grade == null) return;
                String gpaStr = JOptionPane.showInputDialog(frame, "Enter GPA:");
                if (gpaStr == null) return;

                try {
                    int newId = model.getRowCount() + 101;
                    int age = Integer.parseInt(ageStr);
                    double gpa = Double.parseDouble(gpaStr);
                    model.addRow(new Object[]{newId, name, age, grade, gpa});
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Age and GPA must be numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            });

            deleteButton.addActionListener(e -> {
                int selectedRow = table.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(frame, "Please select a row to delete", "No Selection", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int confirm = JOptionPane.showConfirmDialog(frame, "Delete selected student?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    model.removeRow(selectedRow);
                }
            });

            clearButton.addActionListener(e -> {
                int confirm = JOptionPane.showConfirmDialog(frame, "Clear ALL students?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    model.setRowCount(0);
                }
            });

            buttonPanel.add(addButton);
            buttonPanel.add(deleteButton);
            buttonPanel.add(clearButton);

            frame.add(new JScrollPane(table), BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
