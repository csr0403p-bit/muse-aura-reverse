package com.google.common.collect;

import X.AbstractC3830CfJ;
import X.DPD;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class Multisets$ImmutableEntry<E> extends DPD<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public final int count;
    public final E element;

    public Multisets$ImmutableEntry(E element, int count) {
        this.element = element;
        this.count = count;
        AbstractC3830CfJ.A00(count, AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT);
    }
}
