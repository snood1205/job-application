public class SchoolForm extends Form{
  private JTextField fName;
  private AddressForm fAddress;
  private JTextField fYears;
  private JComboBox<String> fGraduated;
  private JTextField fMajor;
  private JTextField fDegree;
  private JTextField fGpa;
  private School school;

  public SchoolForm(){
    String[] graduated = {"Yes", "No"};
    fName = new JTextField(40);
    fAddress = new AddressForm();
    fYears = new JTextField(2);
    fGraduated = new JComboBox<String>(graduated);
    fMajor = new JTextField(20);
    fDegree = new JTextField(5);
    fGpa = new JTextField(4);
  }

  public JTextField getFName(){
    return fName;
  }

  public AddressForm getFAddress(){
    return fAddress;
  }

  public JTextField getFYears(){
    return fYears;
  }

  public JComboBox<String> getFGraduated(){
    return fGraduated;
  }

  public JTextField getFMajor(){
    return fMajor;
  }

  public JTextField getFDegree(){
    return fDegree;
  }

  public JTextField getFGpa(){
    return fGpa;
  }

  public School getSchool(){
    return school;
  }

  public void setSchool(School school){
    this.school = school;
  }

  public JPanel createForm(){
    // TODO: Fill in
    return null;
  }
}