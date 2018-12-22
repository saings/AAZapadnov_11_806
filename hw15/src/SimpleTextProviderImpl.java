public class SimpleTextProviderImpl implements ITextProvider {
    private String string;

    public SimpleTextProviderImpl(String string) {
        this.string = string;
    }

    @Override
    public String getText() {
        return string;
    }
}
