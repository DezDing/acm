import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ClassInfo {
    private static JTable table = null;
    private static JTable getTable(){
        if (table == null){
            table = new JTable();
            table.setRowHeight(23);
            String[] columns = {"姓名","性别","出生日期"};
            DefaultTableModel model = new DefaultTableModel(columns,0);
            table.setModel(model);
            List<String> students = getStudents();
            for(String info:students){
                String[] args;
                args = info.split(",");
                model.addRow(args);
            }
        }
        return table;
    }
    private static List<String> getStudents(){
        List<java.lang.String> list=new ArrayList<>();
        list.add("李哥,男,1981-1-1");
        list.add("小陈,女,1981-1-1");
        list.add("小刘,男,1981-1-1");
        list.add("小张,女,1981-1-1");
        list.add("小董,女,1981-1-1");
        list.add("小吕,女,1981-1-1");
        list.add("小陈,女,1981-1-1");
        return list;
    }

    public static void show() {
        JFrame frame = new JFrame("学生列表");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setPreferredSize(new Dimension(600,500));

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        frame.setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane,BorderLayout.CENTER);
        scrollPane.setViewportView(getTable());
        frame.pack();
        frame.setVisible(true);
    }
}
