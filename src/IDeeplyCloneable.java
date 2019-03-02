
public interface IDeeplyCloneable <TElement extends IDeeplyCloneable<TElement>> {

    TElement makeDeepCopy();

}
