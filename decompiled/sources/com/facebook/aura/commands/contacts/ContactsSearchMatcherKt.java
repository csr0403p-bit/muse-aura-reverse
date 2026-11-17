package com.facebook.aura.commands.contacts;

import X.AbstractC7536F0j;
import java.util.Comparator;

/* loaded from: classes5.dex */
public abstract class ContactsSearchMatcherKt {
    public static final Comparator<ScoredContact> rankOrder() {
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.commands.contacts.ContactsSearchMatcherKt$rankOrder$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Double.valueOf(((ScoredContact) t2).score).compareTo(Double.valueOf(((ScoredContact) t).score));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.commands.contacts.ContactsSearchMatcherKt$rankOrder$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((ScoredContact) t).contact.displayName, ((ScoredContact) t2).contact.displayName) : iCompare;
            }
        };
        return new Comparator() { // from class: com.facebook.aura.commands.contacts.ContactsSearchMatcherKt$rankOrder$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((ScoredContact) t).contact.platformId, ((ScoredContact) t2).contact.platformId) : iCompare;
            }
        };
    }
}
