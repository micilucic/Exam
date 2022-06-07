package exam1;

import java.util.Comparator;
import java.util.Iterator;

public class LautstaerkeComparator implements Comparator<Musikant> {

    public int compare (Musikant o1, Musikant o2) {
        return Double.compare(o2.speieleMusik(), o1.speieleMusik());
    }
}
