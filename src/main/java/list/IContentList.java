package list;

import javax.swing.*;
import java.util.Collection;
import java.util.Comparator;

public interface IContentList {
    public void initializeFrame(JFrame frame);
    public void createContent(Collection collection);
    public void sortBy(Comparator comparator);
    public void updateCollection();

}
