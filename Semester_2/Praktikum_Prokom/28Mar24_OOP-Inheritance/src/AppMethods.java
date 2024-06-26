import javax.swing.JOptionPane;

public class AppMethods extends DataVCD {
    
    private String input = "";
    private boolean isDone = false;

    // adder
    // menambahkan data plain yang akan diset
    // bisa membantu lebih banyak dalam proses aplikasi ini #cmiiw
    public void addData(){
        this.judulList.add("null");
        this.aktorList.add("null");
        this.sutradaraList.add("null");
        this.publisherList.add("null");
        this.ratingList.add("null");
        this.stokList.add(0);
    }

    // remover
    public void removeData(int editIndex){
        this.judulList.remove(editIndex);
        this.aktorList.remove(editIndex);
        this.sutradaraList.remove(editIndex);
        this.publisherList.remove(editIndex);
        this.ratingList.remove(editIndex);
        this.stokList.remove(editIndex);
    }

    // setter
    public void setJudul(int editIndex, String addJudul){
        this.judulList.set(editIndex, addJudul);
    }
    public void setAktor(int editIndex, String addAktor){
        this.aktorList.set(editIndex, addAktor);
    }
    public void setSutradara(int editIndex, String addSutradara){
        this.sutradaraList.set(editIndex, addSutradara);
    }
    public void setPublisher(int editIndex, String addPublisher){
        this.publisherList.set(editIndex, addPublisher);
    }
    public void setRating(int editIndex, int option){
        this.ratingList.set(editIndex, this.kategoriList[option]);
    }
    public void setStok(int editIndex, int addStok){
        this.stokList.set(editIndex, addStok);
    }

    // setter dengan JOptionPane
    public boolean JOPJudul(int editIndex){
        input = JOptionPane.showInputDialog(null, "Masukan judul VCD: ", "Menu Judul", JOptionPane.QUESTION_MESSAGE);
        if(input != null){
            this.judulList.set(editIndex, input);
            isDone = true;
        }else{
            isDone = false;
        }
        return isDone;
    }

    public boolean JOPAktor(int editIndex){
        input = JOptionPane.showInputDialog(null, "Masukan aktornya: ", "Menu Aktor", JOptionPane.QUESTION_MESSAGE);
        if(input != null){
            this.aktorList.set(editIndex, input);
            isDone = true;
        }else{
            isDone = false;
        }
        return isDone;
    }
    public boolean JOPSutradara(int editIndex){
        input = JOptionPane.showInputDialog(null, "Masukan sutradaranya: ", "Menu Sutradara", JOptionPane.QUESTION_MESSAGE);
        if(input != null){
            this.sutradaraList.set(editIndex, input);
            isDone = true;
        }else{
            isDone = false;
        }
        return isDone;
    }
    public boolean JOPPublisher(int editIndex){
        input = JOptionPane.showInputDialog(null, "Masukan publishernya: ", "Menu Publisher", JOptionPane.QUESTION_MESSAGE);
        if(input != null){
            this.publisherList.set(editIndex, input);
            isDone = true;
        }else{
            isDone = false;
        }
        return isDone;
    }
    public boolean JOPRating(int editIndex){
        Object[] rating = {"Semua Umur", "Anak", "Remaja", "Dewasa"};
        Object option = JOptionPane.showInputDialog(null, "Pilih rating VCD: ", "Menu Rating", JOptionPane.QUESTION_MESSAGE, null, rating, rating[0]);
        if(option != null){
            String cnv = (String) option;
            this.ratingList.set(editIndex, cnv);
            isDone = true;
        }else{
            isDone = false;
        }
        return isDone;
    }
    public boolean JOPStok(int editIndex){
        while(true){
            input = JOptionPane.showInputDialog(null, "Masukan stoknya: ", "Menu Stok", JOptionPane.QUESTION_MESSAGE);
            try{
                if(input != null){
                    this.stokList.set(editIndex, Integer.parseInt(input));
                    isDone = true;
                }else{
                    isDone = false;
                }
                return isDone;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input tidak valid!", "Check Menu", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // getter
    public int getSize(){
        int index = judulList.size();
        return index;
    }
    public String getJudul(int index){
        String judul = this.judulList.get(index);
        return judul;
    }
    public String getAktor(int index){
        String aktor = this.aktorList.get(index);
        return aktor;
    }
    public String getSutradara(int index){
        String sutradara = this.sutradaraList.get(index);
        return sutradara;
    }
    public String getPublisher(int index){
        String publisher = this.publisherList.get(index);
        return publisher;
    }
    public String getRating(int index){
        String rating = this.ratingList.get(index);
        return rating;
    }
    public int getStok(int index){
        int stokList = this.stokList.get(index);
        return stokList;
    }
}
