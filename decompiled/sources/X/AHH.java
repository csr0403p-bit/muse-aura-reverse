package X;

import java.util.Collection;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public interface AHH extends Collection, AHD, BOA {
    @Deprecated(message = "Use adding() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "adding(element)", imports = {}))
    AHH<E> A34(E e);

    /* JADX WARN: Incorrect types in method signature: (ITE;)LX/AHH<TE;>; */
    @Deprecated(message = "Use addingAt() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "addingAt(index, element)", imports = {}))
    AHH A3D(Object obj, int i);

    @Deprecated(message = "Use addingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "addingAll(elements)", imports = {}))
    AHH<E> A3M(Collection<? extends E> collection);

    AGK<E> A5c();

    @Deprecated(message = "Use removingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAll(elements)", imports = {}))
    AHH<E> Aai(Collection<? extends E> collection);

    @Deprecated(message = "Use removingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAll(predicate)", imports = {}))
    AHH<E> Aaj(G0U<? super E, Boolean> g0u);

    @Deprecated(message = "Use removingAt() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAt(index)", imports = {}))
    AHH<E> Aam(int i);
}
