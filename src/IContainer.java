

public interface IContainer<TElement extends IAggregable<TElement,TResult> & IDeeplyCloneable<TElement>, TResult> {

    // iterate over all elements and aggregate them
    TResult aggregateAll();


    // clones an element
    TElement cloneElementAtIndex(int index);

}
