
/**
 *
 * @author Ganesh Nayak
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.*;
public class App implements ActionListener{  
    private static JTextField amount;
    private static JRadioButton floate;
    private static  JRadioButton inte;
   private static JComboBox<String> from;
     private static JComboBox<String> to;
    private static JButton conv;
     private static Map<String,Float>map=new LinkedHashMap<String,Float>();
      private static Map<String,String>cur=new LinkedHashMap<String,String>();
      public String intoutput(String a,String b,String c){
          String h;
          try{
      int enter=Integer.parseInt(a);
      float w=Float.parseFloat(b);
      int ans=(int)w;
      ans=enter/ans;
      float g=Float.parseFloat(c);
      int give=(int)g;
      ans=give*ans;
      h=String.valueOf(ans);}
      catch(Exception e){
        h="Error";
      }
       return h;
      }
      public String floatoutput(String a,String b,String c){
        String h;
        try{
      float enter=Float.parseFloat(a);
      float ans=Float.parseFloat(b);
      ans=enter/ans;
      float give=Float.parseFloat(c);
      ans=give*ans;
      h=String.valueOf(ans);}
      catch(Exception e){
        h="Error";
      }
     return h;
      }
 public static void main(String[] args) {
      map.put("United States",1.0f);
  map.put("United Kingdom",0.87f);
  map.put("South Korea",1414.03f);
  map.put("Mexico",19.72f);
  map.put("India",82.53f);
  map.put("Japanese",147.46f);
  cur.put("United States"," Dollar");
 cur.put("United Kingdom"," Pound");
  cur.put("South Korea"," Won");
  cur.put("Mexico"," Peso");
  cur.put("India"," Rupee");
  cur.put("Japanese"," Yen");
  JFrame frame = new JFrame("Currency Convertor");
  frame.setLayout(null);
  frame.setVisible(true);
  JLabel Am = new JLabel("Amount:");
  Am.setBounds(40,20,100,20);
  JLabel Form = new JLabel("Format:");
  Form.setBounds(40,60,100,20);
  JLabel fromc = new JLabel("From:");
  fromc.setBounds(40,100,100,20);
  JLabel toc = new JLabel("To:");
  toc.setBounds(40,140,100,20); 
  amount = new JTextField();
  amount.addKeyListener(new KeyAdapter(){
 public void keyTyped(KeyEvent e){
 char c=e.getKeyChar();
 if(!((c>='0') && (c<='9') ||(c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
 e.consume();
 }
 }
 });
  amount.setBounds(160,20,120,20);
  ButtonGroup G = new ButtonGroup();
  floate = new JRadioButton("Float");
  floate.setBounds(160,60,60,20);
  inte = new JRadioButton("Int");
  inte.setBounds(220,60,120,20);
  G.add(floate);
   G.add(inte);
  String countries[] = {"United States","United Kingdom","South Korea","Mexico","India","Japanese"};
  from = new JComboBox<>(countries);
  from.setBounds(160,100,120,20);
    to = new JComboBox<>(countries);
  to.setBounds(160,140,120,20);
  conv = new JButton("Convert");
  conv.setBounds(130,180,80,20);
conv.addActionListener(new App());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.add(Am);
  frame.add(Form);
  frame.add(fromc);
  frame.add(toc);
  frame.add(amount);
  frame.add(floate);
  frame.add(inte);
  frame.add(from);
  frame.add(to);
  frame.add(conv);
  frame.setSize(400,300);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
          String str = e.getActionCommand();
  if(str.equals("Convert")){
      String h;
      if(floate.isSelected()==true){
     h=floatoutput(amount.getText(),map.get(from.getSelectedItem().toString()).toString(),map.get(to.getSelectedItem().toString()).toString());
      }
      else{
        h=intoutput(amount.getText(),map.get(from.getSelectedItem().toString()).toString(),map.get(to.getSelectedItem().toString()).toString());
      }
     h+=" "+cur.get(to.getSelectedItem().toString());
     JOptionPane.showMessageDialog(null,h);
  }
    }
}
