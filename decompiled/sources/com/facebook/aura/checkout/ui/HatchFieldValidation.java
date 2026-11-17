package com.facebook.aura.checkout.ui;

import X.C60O;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface HatchFieldValidation {

    public final class Invalid implements HatchFieldValidation {
        public final String message;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m341constructorimpl(String str) {
            C7384Etj.A0Y(str, 0);
            return str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Invalid m340boximpl(String str) {
            return new Invalid(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m342equalsimpl(String str, Object obj) {
            return (obj instanceof Invalid) && C7384Etj.areEqual(str, ((Invalid) obj).message);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m345toStringimpl(String str) {
            return C60O.A0r("Invalid(message=", str);
        }

        public boolean equals(Object obj) {
            return m342equalsimpl(this.message, obj);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return C60O.A0r("Invalid(message=", this.message);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m346unboximpl() {
            return this.message;
        }

        public /* synthetic */ Invalid(String str) {
            this.message = str;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m343equalsimpl0(String str, String str2) {
            return C7384Etj.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m344hashCodeimpl(String str) {
            return str.hashCode();
        }
    }

    public final class Pending implements HatchFieldValidation {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public String toString() {
            return "Pending";
        }

        public int hashCode() {
            return 1916357086;
        }
    }

    public final class Valid implements HatchFieldValidation {
        public static final int $stable = 0;
        public static final Valid INSTANCE = new Valid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Valid);
        }

        public String toString() {
            return "Valid";
        }

        public int hashCode() {
            return 1871099395;
        }
    }
}
