package X;

import java.util.Collection;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public interface AHG extends Collection, BOA, BQI {
    @Deprecated(message = "Use adding() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "adding(element)", imports = {}))
    AHG<E> A35(E e);

    @Deprecated(message = "Use removing() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removing(element)", imports = {}))
    AHG<E> Aaa(E e);

    @Deprecated(message = "Use removingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAll(elements)", imports = {}))
    AHG<E> Aak(Collection<? extends E> collection);
}
