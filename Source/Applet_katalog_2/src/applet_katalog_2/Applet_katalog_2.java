package applet_katalog_2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class Applet_katalog_2 extends JApplet {
    
    JPanel osnoven, levo, desno, levo1, levo3,
            kategorii, desno1, desno3, ocena1, ocena2;
    JRadioButton k1, k2, k3, k4;
    JComboBox lista;
    JTextField avtor, oc1, oc2;
    JLabel avt, o1, o2;
    JButton kopce;
    JTextArea opis, slicni;
    
    @Override
    public void init(){
        
        osnoven = new JPanel(new GridLayout(1,2));
        osnoven.setBorder(new TitledBorder("Каталог"));
        this.getContentPane().add(osnoven);
        this.setSize(800,600);
        
        levo = new JPanel(new BorderLayout());
        levo1 = new JPanel(new GridLayout(2,1));
        
        kategorii = new JPanel(new GridLayout(2,2));
        k1 = new JRadioButton("Психолошки трилери");
        k2 = new JRadioButton("Мистерии");
        k3 = new JRadioButton("Авантури");
        k4 = new JRadioButton("Научна фантастика");
        
        k1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              lista.removeAllItems();
              lista.addItem("--Избери психолошки трилер--");
              lista.addItem("Од минатото не се бега");
              lista.addItem("Преживеј за да раскажуваш");
              lista.addItem("Остри предмети");
            }
            
            });
        
        k2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              lista.removeAllItems();
              lista.addItem("--Избери трилер--");
              lista.addItem("Ние бевме лажговци");
              lista.addItem("Големи и мали лаги");
              lista.addItem("Студена опасност");
            }
            
            });
        
        k3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              lista.removeAllItems();
              lista.addItem("--Избери авантура--");
              lista.addItem("Судир на кралеви");
              lista.addItem("Временската порта");
              lista.addItem("Ѕвер");
            }
            
            });
        
        k4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              lista.removeAllItems();
              lista.addItem("--Избери научна фантастика--");
              lista.addItem("Острови во ветер");
              lista.addItem("Огнот на животот");
              lista.addItem("Паралелен свет");
            }
            
            });
        
        
        
        
        
        ButtonGroup g = new ButtonGroup();
        g.add(k1);
        g.add(k2);
        g.add(k3);
        g.add(k4);
        kategorii.add(k1);
        kategorii.add(k2);
        kategorii.add(k3);
        kategorii.add(k4);
        
        lista = new JComboBox();
        lista.setBorder(new TitledBorder("Листа на книги:"));
        lista.addItem("Изберете книга");
        
        levo1.add(kategorii);
        levo1.add(lista);
        levo.add(levo1, BorderLayout.NORTH);
        
        opis = new JTextArea();
        opis.setBorder(new TitledBorder("Краток опис:"));
        opis.setEnabled(false);
        
        
        levo.add(opis, BorderLayout.CENTER);
        
        levo3 = new JPanel(new GridLayout(1,2));
        avt = new JLabel("Автор: ");
        avtor = new JTextField();
        avtor.setEnabled(false);
        
        levo3.add(avt);
        levo3.add(avtor);
        levo.add(levo3, BorderLayout.SOUTH);
        osnoven.add(levo);
        
        
        
        desno = new JPanel(new GridLayout(3,1));
        desno1 = new JPanel(new GridLayout(2,1));
        desno.setBorder(new TitledBorder(""));
        
        ocena1 = new JPanel(new GridLayout(1,2));
        ocena2 = new JPanel(new GridLayout(1,2));
        
        o1 = new JLabel("Оценка од читатели:");
        oc1 = new JTextField();
        oc1.setEnabled(false);
        
        o2 = new JLabel("Моја оценка:");
        oc2 = new JTextField();
        oc2.setEnabled(false);
        
        ocena1.add(o1);
        ocena1.add(oc1);
        ocena2.add(o2);
        ocena2.add(oc2);
        desno1.add(ocena1);
        desno1.add(ocena2);
        desno.add(desno1);
        
        
        slicni = new JTextArea();
        slicni.setBorder(new TitledBorder("Слични книги:"));
        slicni.setEnabled(false);
        desno.add(slicni);
        osnoven.add(desno);
        
        desno3 = new JPanel(new BorderLayout());
        kopce = new JButton("Прикажи детали!");
        desno3.add(kopce, BorderLayout.SOUTH);
        desno.add(desno3);
        osnoven.add(desno);
        
        
        kopce.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(lista.getSelectedItem().equals("Од минатото не се бега")){
                    opis.setText("Жанет Килберг сè уште не се откажува\n"
                            + "од случајот со убиените деца имигранти,\nно нејзината работа ја прекинува "
                            + "страшно\nморничаво убиство на бизнисмен во Стокхолм.\n" +"На местото на злосторството"
                            + "има бизарни детали\nкои упатуваат на тоа дека станува збор\nза ритуално убиство или одмазда.\n" + "\n" +
                            "Сè се враќа, сè се плаќа.\n" + "\n" + "ОД МИНАТОТО НЕ СЕ БЕГА.");
                    avtor.setText("Ерик Аксл Сунд");
                    oc1.setText("8");
                    oc2.setText("9");
                    slicni.setText("Преживеј за да раскажуваш\nОстри Предмети");
                    
                }else if(lista.getSelectedItem().equals("Преживеј за да раскажуваш")){
                    opis.setText("Една грозоморна ноќ завршува со брутално\nубиено семејство."
                            + "Мајката и трите деца\nсе мртви, а таткото - и потенцијален\n"
                            + "осомничен - се бори за живот\nна одделот за"
                            + "интензивна нега. Случајот\nе навидум едноставен,"
                            + "тешката финансиска\n"
                            + "ситуација го натерала\nда си го поштеди семејството"
                            + "од беда\nпред да изврши\nсамоубиство, но детективката"
                            + "Ди Ди Ворен\n знае дека ништо никогаш не е толку"
                            + "\nедноставно.");
                    avtor.setText("Лиса Гарднер");
                    oc1.setText("7");
                    oc2.setText("7");
                    slicni.setText("Од минатото не се бега\nОстри предмети");
                    
                }else if(lista.getSelectedItem().equals("Остри предмети")){
                    opis.setText("Зборовите се како патоказ кон\nнпроблематичното минато на"
                            + "новинарката\nКамил Прикер. Освежена по краткиот\nпрестој "
                            + "во психијатриска болница,\nпрвата задача која"
                            + "ја добива Камил од\nвторо пласираниот весник каде што"
                            + "работи,\nпротив нејзина волја ја испраќа назад\nво"
                            + "својот роден град.");
                    avtor.setText("Џилијан Флин");
                    oc1.setText("6");
                    oc2.setText("8");
                    slicni.setText("Преживеј за да раскажуваш\nОд минатото не се бега");
                    
                }else if(lista.getSelectedItem().equals("Студена опасност")){
                    opis.setText("Пет жени во текот на две години\nсе исчезнати во малото"
                            + "планинско гратче \nКлири, Северна Каролина и приближно на"
                            + "\nместото каде што последен пат е видена \nсекоја една од нив,"
                            + "оставена е плава лента.\nШефот на полицијата Бартон,"
                            + "заедно со\nнеговата мала "
                            + "екипа, се во потрага"
                            + "по серискиот\nубиец наречен Блу.");
                    avtor.setText("Сандра Браун");
                    oc1.setText("8");
                    oc2.setText("6");
                    slicni.setText("Ние бевме лажговци\nГолеми и мали лаги");
                    
                }else if(lista.getSelectedItem().equals("Ние бевме лажговци")){
                    opis.setText("Прекрасно, богато и специфично семејство.\n"
                            + "Приватен остров...\nБрилијантно, повредено"
                            + " девојче.\nСтрасно, посиромашно момче.\nГрупа "
                            + "од четири пријатели - Лажговците\n- чие "
                            + "пријателство станува деструктивно.\nРеволуција. Несреќа. Тајна. \n"
                            + "Лаги врз лаги врз лаги.\nВистинска љубов. Вистината.");
                    avtor.setText("Е. Локхарт");
                    oc1.setText("10");
                    oc2.setText("10");
                    slicni.setText("Големи и мали лаги\nСтудена опасност");
                    
                }else if(lista.getSelectedItem().equals("Големи и мали лаги")){
                    opis.setText("Училиштето Пириви е мало, прекрасно\n"
                            + "основно школо во близина на плажа каде\n"
                            + "децата учат дека насилството е неубаво\n"
                            + "и недозволиво.Но и покрај тоа,\n"
                            + "еден вечерен, родителски училишен настан\n"
                            + "се претвора во хаос и завршува со смртен случај.\n"
                            + "Пиштат сирени. Врескаат луѓе.\n"
                            + "Еден родител е мртов. Дали станува збор\n"
                            + "за убиство, трагична несреќа\n"
                            + "или нешто сосема трето?");
                    avtor.setText("Лиен Мориати");
                    oc1.setText("7");
                    oc2.setText("7");
                    slicni.setText("Ние бевме лажговци\nСтудена опасност");
                    
                }else if(lista.getSelectedItem().equals("Судир на кралеви")){
                    opis.setText("Џофри Ланистер, Ренли Баратеон и\n"
                            + "Станис Баратеон, три крала – еден трон.\n"
                            + "Додека Роб Старк и неговата северничка\n"
                            + "војска војуваат против Ланистерс,Станис Баратеон\n"
                            + "се прогласува себеси за крал на\n"
                            + "Вестерос и планира инвазија за да го\n"
                            + "преземе престолот на својот покоен брат,\n"
                            + "склучувајќи сојуз со страшната\n"
                            + "Мелисандра, чудна свештеничка\n"
                            + "на еден уште почуден бог.");
                    avtor.setText("Џорџ Р.Р. Мартин");
                    oc1.setText("7");
                    oc2.setText("9");
                    slicni.setText("Временската порта\nЅвер");
                    
                }else if(lista.getSelectedItem().equals("Временската порта")){
                    opis.setText("Во оваа книга се раскажува за двајца близнаци\n"
                            + "Џејсон и Џулија од градот и едно\n"
                            + "црвенокосо момче Рик. Близнаците се\n"
                            + "преселуваат во големата вила „Арго“.\n"
                            + "Во таа вила се кријат многу мистерии и тајни.\n"
                            + "Тие ќе откријат врата скриена зад\n"
                            + "ормар која води кон четири врати.\n"
                            +"\n"
                            +"Од тие врати две водат кон неврат, а една надолу.");
                    avtor.setText("Улис Мур");
                    oc1.setText("8");
                    oc2.setText("8");
                    slicni.setText("Ѕвер\nСудир на кралеви");
                    
                }else if(lista.getSelectedItem().equals("Ѕвер")){
                    opis.setText("ЈАС СУМ ЅВЕР. БЕСТИЈА!!!\n"
                            +"Не сум ниту волк, ниту мечка, ниту горила,\n"
                            +"ниту куче, туку сум ново суштесво што\n"
                            +"оди исправено.ЈАС СУМ ЧУДОВИШТЕ.\n"
                            +"И тоа е вистина. Голема вистина во\n"
                            + "центарот на Њујорк. Сѐ му се случува на едно\n"
                            + "од најпопуларните, најубавите, најбараните\n"
                            + "момчиња во училиштето Татл, со еден\n"
                            + "збор совршениот Кајл Кингсбери.");
                    avtor.setText("Алекс Флин");
                    oc1.setText("9");
                    oc2.setText("7");
                    slicni.setText("Временска порта\nСудир на кралеви");
                    
                }else if(lista.getSelectedItem().equals("Острови во ветер")){
                    opis.setText("Во 23-ти век, копното на планетета Земја\n"
                            + "веќе не е рамна површина, тоа е разделено\n"
                            + "на билиони парчиња кои се наоѓаат на голема\n"
                            + "височина и орбитираат околу неа.\n"
                            +"Се појавуваат нови суштества, луѓето\n"
                            + "не се тоа што се денес.\n"
                            +"Но сепак главното нешто кое нѝ треба е ВОДАТА.");
                    avtor.setText("Дејвид Карлајл");
                    oc1.setText("9");
                    oc2.setText("9");
                    slicni.setText("Огнот на животот\nПаралелен свет");
                    
                }else if(lista.getSelectedItem().equals("Огнот на животот")){
                    opis.setText("Огнот на животот е фантазија и напрегнат трилер,\n"
                            + "во кој љубовта, пријателството, желбата за\n"
                            + "моќ и оддаденоста на идеалите силно одекнуваат\n"
                            + "во брзиот развој на приказната.\n"
                            +"Приказната во сагата се базира на нашиот\n"
                            + "свет, населен со луѓе и имагинарни димензии\n"
                            + "во кои живеат посупериорни суштества - ангели.");
                    avtor.setText("Е.Џ. Aлибис");
                    oc1.setText("7");
                    oc2.setText("6");
                    slicni.setText("Острови во ветер\nПаралелен свет");
                    
                }else if(lista.getSelectedItem().equals("Паралелен свет")){
                    opis.setText("Ова не е класичен роман, напротив, ова е\n"
                            + "збирка на повеќе приказни од различни содржини,\n"
                            + "но сепак сите поврзани со мистичното и\n"
                            + "за некои луѓе нереално. Книгата е поделена\n"
                            + "на 6 делови + заклучок: прикази, исчезнати,\n"
                            + "предвидувања, реинкарнација, сведочење на\n"
                            + "вратените, што кажуваат покојните и секако\n"
                            + "заклучокот.Сите овие 7 делови, содржат по 10тина\n"
                            + "приказни на одредената тема. Книгата содржи\n"
                            + "и слики од НАСА, но и од случајни минувачи кои\n"
                            + "биле сведоци на некој неверојатен настан.");
                    avtor.setText("Б.Д. Бенедикт");
                    oc1.setText("10");
                    oc2.setText("9");
                    slicni.setText("Огнот на животот\nОстрови во ветер");
                    
                }else{
                    opis.setText("");
                    avtor.setText("");
                    oc1.setText("");
                    oc2.setText("");
                    slicni.setText("");
                    
                }
            }
            
            
        });
        
        
        
    }
    
}
