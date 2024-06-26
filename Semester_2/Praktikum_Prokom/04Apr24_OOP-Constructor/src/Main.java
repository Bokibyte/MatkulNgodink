public class Main {
    private static AppUI AppGUI = new AppUI();

    public static void main(String[] args) throws Exception {

        // Variabel boolean untuk menentukan apakah user ingin keluar atau tidak
        boolean exit = false;

        while(!exit){
            AppGUI.menu();
            if(AppGUI.getOption().equals("toEntry")){
                AppGUI.menuEntry();
                while(AppGUI.getOption().equals("next")){
                    AppGUI.menuEntry();
                }
            }
            if(AppGUI.getOption().equals("toShow")){
                AppGUI.menuShow();
            }
            if(AppGUI.getOption().equals("exit")){
                exit = true;
            }
        }
    }
}
