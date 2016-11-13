package ismael.com.uedcontrollite.interfaces;

public interface ILogin {

        interface View{
            public void setMessageError(String error, int idview);
        }

        interface Presenter{
            public boolean validateCredentials(String user, String passw);
        }

}
