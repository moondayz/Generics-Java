import java.util.ArrayList;
import java.util.List;

public class myContainer <TElement extends IAggregable<TElement, TResult> & IDeeplyCloneable<TElement>, TResult> implements IContainer<TElement, TResult> {


    private List<TElement> list;
    private TElement first;
    private TResult last;
    private int index;

    public myContainer(List<TElement> mylist) {
        //this.list = new ArrayList<>();
        this.list = mylist;
        index = mylist.size()-1;

    }


    @Override
    public TResult aggregateAll() {

        TResult r =null;
        for(TElement e : list ) {
            r= e.aggregate(r);

        }
        //System.out.println(r);

        return r ;
    }

    @Override
    public TElement cloneElementAtIndex(int indexx) {

        return list.get(indexx).makeDeepCopy();
    }


    public List<TElement> getList() {
        return list;
    }


}
