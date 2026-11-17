package com.facebook.aura.pairs;

import com.facebook.aura.network.api.StefiMusePath;

/* loaded from: classes3.dex */
public final class RecipientsQueryPath implements StefiMusePath.Extension {
    public static final RecipientsQueryPath INSTANCE = new RecipientsQueryPath();
    public static final String value = "/sharing/recipients/query";

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof RecipientsQueryPath);
    }

    @Override // com.facebook.aura.network.api.StefiPath
    public String getValue() {
        return value;
    }

    public String toString() {
        return "RecipientsQueryPath";
    }

    public int hashCode() {
        return 231081966;
    }
}
