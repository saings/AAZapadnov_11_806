import java.io.File;
//
//
//
//
//
//
//
public class TitleTextProviderImpl extends FileTextProviderImpl {
    public TitleTextProviderImpl(File input) {
        super(input);
    }

    @Override
    public String getText() {
        return input.getName() + " " + super.getText();
    }
}
