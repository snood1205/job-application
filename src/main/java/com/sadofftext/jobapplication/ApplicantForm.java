package com.sadofftext.jobapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ApplicantForm extends Form{
  private NameForm fName;
  private SocialSecurityForm fSsn;
  private AddressForm fAddress;
  private PhoneNumberForm fHome;
  private PhoneNumberForm fCell;
  private JTextField fAge;
  private DateForm fBirthday;
  private EmailForm fEmail;
  private DateForm fToday;
  private DayForm fMon;
  private DayForm fTues;
  private DayForm fWed;
  private DayForm fThur;
  private DayForm fFri;
  private DayForm fSat;
  private DayForm fSun;
  private JComboBox<String> fFulltime;
  private JComboBox<String> fParttime;
  private JTextField fHours;
  private JComboBox<String> fWorkNights;
  private DateForm fAvailable;
  private JComboBox<String> fEmployedHereBefore;
  private JComboBox<String> fCertifiedToWork;
  private FelonForm fFelon;
  private JComboBox<String> fDl;
  private SchoolForm fHighSchool;
  private SchoolForm fUniv;
  private SchoolForm fHighestDegree;
  private MilitaryForm fMilitary;
  private WorkForm fWork1;
  private WorkForm fWork2;
  private WorkForm fWork3;
  private ReferenceForm fReference1;
  private ReferenceForm fReference2;
  private ReferenceForm fReference3;
  private Applicant applicant;

  public ApplicantForm(){
    String[] yesNo = {"Yes", "No"};
    fName = new NameForm();
    fSsn = new SocialSecurityForm();
    fAddress = new AddressForm();
    fHome = new PhoneNumberForm();
    fCell = new PhoneNumberForm();
    fAge = new JTextField(2);
    fBirthday = new DateForm();
    fEmail = new EmailForm();
    fToday = new DateForm();
    fMon = new DayForm("Monday");
    fTues = new DayForm("Tuesday");
    fWed = new DayForm("Wednesday");
    fThur = new DayForm("Thursday");
    fFri = new DayForm("Friday");
    fSat = new DayForm("Saturday");
    fSun = new DayForm("Sunday");
    fFulltime = new JComboBox<String>(yesNo);
    fParttime = new JComboBox<String>(yesNo);
    fHours = new JTextField(2);
    fWorkNights = new JComboBox<String>(yesNo);
    fAvailable = new DateForm();
    fEmployedHereBefore = new JComboBox<String>(yesNo);
    fCertifiedToWork = new JComboBox<String>(yesNo);
    fFelon = new FelonForm();
    fDl = new JComboBox<String>(yesNo);
    fHighSchool = new SchoolForm();
    fUniv = new SchoolForm();
    fHighestDegree = new SchoolForm();
    fMilitary = new MilitaryForm();
    fWork1 = new WorkForm();
    fWork2 = new WorkForm();
    fWork3 = new WorkForm();
    fReference1 = new ReferenceForm();
    fReference2 = new ReferenceForm();
    fReference3 = new ReferenceForm();
    applicant = null;
  }

  public NameForm getFName(){
    return fName;
  }

  public SocialSecurityForm getFSsn(){
    return fSsn;
  }

  public AddressForm getFAddress(){
    return fAddress;
  }

  public PhoneNumberForm getFHome(){
    return fHome;
  }

  public PhoneNumberForm getFCell(){
    return fCell;
  }

  public JTextField getFAge(){
    return fAge;
  }

  public DateForm getFBirthday(){
    return fBirthday;
  }

  public EmailForm getFEmail(){
    return fEmail;
  }

  public DateForm getFToday(){
    return fToday;
  }

  public DayForm getFMon(){
    return fMon;
  }

  public DayForm getFTues(){
    return fTues;
  }

  public DayForm getFWed(){
    return fWed;
  }

  public DayForm getFThur(){
    return fThur;
  }

  public DayForm getFFri(){
    return fFri;
  }

  public DayForm getFSat(){
    return fSat;
  }

  public DayForm getFSun(){
    return fSun;
  }

  public JComboBox<String> getFFulltime(){
    return fFulltime;
  }

  public JComboBox<String> getFParttime(){
    return fParttime;
  }

  public JTextField getFHours(){
    return fHours;
  }

  public JComboBox<String> getFWorkNights(){
    return fWorkNights;
  }

  public DateForm getFAvailable(){
    return fAvailable;
  }

  public JComboBox<String> getFEmployedHereBefore(){
    return fEmployedHereBefore;
  }

  public JComboBox<String> getFCertifiedToWork(){
    return fCertifiedToWork;
  }

  public FelonForm getFFelon(){
    return fFelon;
  }

  public JComboBox<String> getFDl(){
    return fDl;
  }

  public SchoolForm getFHighSchool(){
    return fHighSchool;
  }

  public SchoolForm getFUniv(){
    return fUniv;
  }

  public SchoolForm getFHighestDegree(){
    return fHighestDegree;
  }

  public MilitaryForm getFMilitary(){
    return fMilitary;
  }

  public WorkForm getFWork1(){
    return fWork1;
  }

  public WorkForm getFWork2(){
    return fWork2;
  }

  public WorkForm getFWork3(){
    return fWork3;
  }

  public ReferenceForm getFReference1(){
    return fReference1;
  }

  public ReferenceForm getFReference2(){
    return fReference2;
  }

  public ReferenceForm getFReference3(){
    return fReference3;
  }

  public Applicant getApplicant(){
    return applicant;
  }

  public void setApplicant(Applicant applicant){
    this.applicant = applicant;
  }

  @Override
  public JPanel createForm(){
    JPanel panel = new JPanel(new GridLayout(8,7));

    JButton name = new JButton("Name");
    JButton ssn = new JButton("Social Security Number");
    JButton address = new JButton("Address");
    JButton home = new JButton("Home Phone Number");
    JButton cell = new JButton("Cell Phone Number");
    JButton birthday = new JButton("Birthday");
    JButton email = new JButton("Email Address");
    JButton today = new JButton("Today");
    JButton mon = new JButton("Monday");
    JButton tues = new JButton("Tuesday");
    JButton wed = new JButton("Wednesday");
    JButton thur = new JButton("Thursday");
    JButton fri = new JButton("Friday");
    JButton sat = new JButton("Saturday");
    JButton sun = new JButton("Sunday");
    JButton available = new JButton("Date Available");
    JButton felon = new JButton("Felon Status");
    JButton hs = new JButton("High School");
    JButton univ = new JButton("University");
    JButton hd = new JButton("Highest Degree");
    JButton military = new JButton("Military Information");
    JButton work1 = new JButton("Most Recent Employer");
    JButton work2 = new JButton("Second Most Recent Employer");
    JButton work3 = new JButton("Third Most Recent Employer");
    JButton ref1 = new JButton("First Reference");
    JButton ref2 = new JButton("Second Reference");
    JButton ref3 = new JButton("Third Reference");
    JButton submit = new JButton("Submit");
    
    name.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFName().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    ssn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFSsn().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    address.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFAddress().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    home.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFHome().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    cell.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFCell().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    birthday.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFBirthday().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    email.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFEmail().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    today.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFToday().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    }); 

    mon.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFMon().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    tues.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFTues().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    wed.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFWed().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    thur.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFThur().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    fri.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFFri().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    sat.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFSat().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    sun.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFSun().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    available.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFAvailable().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    felon.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFFelon().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    hs.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFHighSchool().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    univ.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFUniv().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    hd.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFHighestDegree().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    military.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFMilitary().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    work1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFWork1().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    work2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFWork2().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    work3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFWork3().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    ref1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFReference1().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    ref2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFReference2().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    ref3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame fr = new JFrame();
        fr.add(getFReference3().createForm());
        fr.pack();
        fr.setVisible(true);
      }
    });

    submit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Name nm = getFName().getName();
        SocialSecurity ssn = getFSsn().getSocialSecurity();
        Address ad = getFAddress().getAddress();
        PhoneNumber hm = getFHome().getPhoneNumber();
        PhoneNumber cl = getFCell().getPhoneNumber();
        int age = Integer.valueOf(getFAge().getText());
        Date bd = getFBirthday().getDate();
        Email em = getFEmail().getEmail();
        Date td = getFToday().getDate();
        Day mon = getFMon().getDay();
        Day tue = getFTues().getDay();
        Day wed = getFWed().getDay();
        Day thu = getFThur().getDay();
        Day fri = getFFri().getDay();
        Day sat = getFSat().getDay();
        Day sun = getFSun().getDay();
        boolean ft = (getFFulltime().getSelectedIndex() == 0);
        boolean pt = (getFParttime().getSelectedIndex() == 0);
        int hr = Integer.valueOf(getFHours().getText());
        boolean nt = (getFWorkNights().getSelectedIndex() == 0);
        Date av = getFAvailable().getDate();
        boolean pe = (getFEmployedHereBefore().getSelectedIndex() == 0);
        boolean us = (getFCertifiedToWork().getSelectedIndex() == 0);
        Felon fl = getFFelon().getFelon();
        boolean dl = (getFDl().getSelectedIndex() == 0);
        School hs = getFHighSchool().getSchool();
        School un = getFUniv().getSchool();
        School hd = getFHighestDegree().getSchool();
        Military my = getFMilitary().getMilitary();
        Work w1 = getFWork1().getWork();
        Work w2 = getFWork2().getWork();
        Work w3 = getFWork3().getWork();
        Reference r1 = getFReference1().getReference();
        Reference r2 = getFReference2().getReference();
        Reference r3 = getFReference3().getReference();
        setApplicant(new Applicant(
          nm, ssn, ad, hm, cl, age, bd, em, td, mon, tue, wed, thu, fri, sat, sun, ft, pt, hr, nt,
          av, pe, us, fl, dl, hs, un, hd, my, w1, w2, w3, r1, r2, r3)
        );
        setSubmitted(true);
      }
    });

    // Row 1
    panel.add(name); // 1
    panel.add(ssn); // 2
    panel.add(address); // 3
    panel.add(home); // 4
    panel.add(cell); // 5
    panel.add(new JLabel("Age:")); // 6
    panel.add(getFAge()); // 7

    // Row 2
    panel.add(birthday); // 1
    panel.add(email); // 2
    panel.add(today); // 3
    panel.add(new JLabel("Days able to work:")); // 4
    panel.add(new JLabel("")); // 5
    panel.add(new JLabel("")); // 6
    panel.add(new JLabel("")); // 7

    // Row 3
    panel.add(mon); // 1
    panel.add(tues); // 2
    panel.add(wed); // 3
    panel.add(thur); // 4
    panel.add(fri); // 5
    panel.add(sat); // 6
    panel.add(sun); // 7

    // Row 4
    panel.add(new JLabel("Full Time?")); // 1
    panel.add(getFFulltime()); // 2
    panel.add(new JLabel("Part Time?")); // 3
    panel.add(getFParttime()); // 4
    panel.add(new JLabel("Hours Desired per Week")); // 5
    panel.add(getFHours()); // 6
    panel.add(new JLabel("")); // 7

    // Row 5
    panel.add(new JLabel("Work nights?")); // 1
    panel.add(getFWorkNights()); // 2
    panel.add(available); // 3
    panel.add(new JLabel("Employed here before?")); // 4
    panel.add(getFEmployedHereBefore()); // 5
    panel.add(new JLabel("Certified to work in the US?")); // 6
    panel.add(getFCertifiedToWork()); // 7

    // Row 6
    panel.add(felon); // 1
    panel.add(new JLabel("Driver's License?")); // 2
    panel.add(getFDl()); // 3
    panel.add(hs); // 4
    panel.add(univ); // 5
    panel.add(hd); // 6
    panel.add(military); // 7

    // Row 7
    panel.add(work1); // 1
    panel.add(work2); // 2
    panel.add(work3); // 3
    panel.add(ref1); // 4
    panel.add(ref2); // 5
    panel.add(ref3); // 6
    panel.add(new JLabel("")); // 7

    // Row 8
    panel.add(submit);

    return panel;
  }
}