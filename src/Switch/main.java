package Switch;

public class main {
    public static void main(String[] args) {
        System.out.println(getDownLoadLink(DeviceType.WEB));
    }

    public static String getDownLoadLink(DeviceType type){
        String link = null;

        switch (type) {
            case ANDROID:
                link = "бла бла бла";
                break;
            case IOS:
                link = "бле бле бле";
            case WEB:
                link = "блу блу блу";
                break;
        }

        return link;
    }
}

enum DeviceType {
    ANDROID,
    IOS,
    WEB
}