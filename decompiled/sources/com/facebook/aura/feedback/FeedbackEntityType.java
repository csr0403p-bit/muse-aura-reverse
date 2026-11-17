package com.facebook.aura.feedback;

import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public final class FeedbackEntityType {
    public static final String FEED_UNIT = "feed_unit";
    public final String wireValue;
    public static final Companion Companion = new Companion();
    public static final String IDEA = "idea";

    public final class Companion {
        /* renamed from: getFEED_UNIT-nN4RILs, reason: not valid java name */
        public final String m854getFEED_UNITnN4RILs() {
            return FeedbackEntityType.FEED_UNIT;
        }

        /* renamed from: getIDEA-nN4RILs, reason: not valid java name */
        public final String m855getIDEAnN4RILs() {
            return FeedbackEntityType.IDEA;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m848constructorimpl(String str) {
        C7384Etj.A0Y(str, 0);
        return str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FeedbackEntityType m847boximpl(String str) {
        return new FeedbackEntityType(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m849equalsimpl(String str, Object obj) {
        return (obj instanceof FeedbackEntityType) && C7384Etj.areEqual(str, ((FeedbackEntityType) obj).wireValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m852toStringimpl(String str) {
        return FGI.A0U("FeedbackEntityType(wireValue=", str, ")");
    }

    public boolean equals(Object obj) {
        return m849equalsimpl(this.wireValue, obj);
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public int hashCode() {
        return this.wireValue.hashCode();
    }

    public String toString() {
        return m852toStringimpl(this.wireValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m853unboximpl() {
        return this.wireValue;
    }

    public /* synthetic */ FeedbackEntityType(String str) {
        this.wireValue = str;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m850equalsimpl0(String str, String str2) {
        return C7384Etj.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m851hashCodeimpl(String str) {
        return str.hashCode();
    }
}
