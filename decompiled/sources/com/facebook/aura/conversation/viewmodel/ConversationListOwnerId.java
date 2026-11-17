package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass002;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes2.dex */
public final class ConversationListOwnerId {
    public static final Companion Companion = new Companion();
    public final String value;

    public final class Companion {
        /* renamed from: random-38SHtFc, reason: not valid java name */
        public final String m708random38SHtFc() {
            return AnonymousClass002.A0k();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: access$constructor-impl, reason: not valid java name */
    public static final /* synthetic */ String m700access$constructorimpl(String str) {
        return str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ConversationListOwnerId m701boximpl(String str) {
        return new ConversationListOwnerId(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m702constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m703equalsimpl(String str, Object obj) {
        return (obj instanceof ConversationListOwnerId) && C7384Etj.areEqual(str, ((ConversationListOwnerId) obj).value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m706toStringimpl(String str) {
        return FGI.A0U("ConversationListOwnerId(value=", str, ")");
    }

    public boolean equals(Object obj) {
        return m703equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return m706toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m707unboximpl() {
        return this.value;
    }

    public /* synthetic */ ConversationListOwnerId(String str) {
        this.value = str;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m704equalsimpl0(String str, String str2) {
        return C7384Etj.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m705hashCodeimpl(String str) {
        return str.hashCode();
    }
}
