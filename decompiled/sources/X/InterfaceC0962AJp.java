package X;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.AJp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0962AJp<K, V> extends BO6<K, V> {
    AGJ<K, V> A5b();

    @Deprecated(message = "Use putting() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "putting(key, value)", imports = {}))
    InterfaceC0962AJp<K, V> AYj(K k, V v);

    @Deprecated(message = "Use puttingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "puttingAll(m)", imports = {}))
    InterfaceC0962AJp<K, V> AYm(Map<? extends K, ? extends V> map);

    @Deprecated(message = "Use removing() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removing(key)", imports = {}))
    InterfaceC0962AJp<K, V> AaZ(K k);
}
