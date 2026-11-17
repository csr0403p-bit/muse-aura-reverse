package com.facebook.aura.payments.cardvalidation;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface HatchCardFieldState {

    public final class Invalid implements HatchCardFieldState {
        public final HatchCardFieldFailure failure;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static HatchCardFieldFailure m1839constructorimpl(HatchCardFieldFailure hatchCardFieldFailure) {
            C7384Etj.A0Y(hatchCardFieldFailure, 0);
            return hatchCardFieldFailure;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Invalid m1838boximpl(HatchCardFieldFailure hatchCardFieldFailure) {
            return new Invalid(hatchCardFieldFailure);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1840equalsimpl(HatchCardFieldFailure hatchCardFieldFailure, Object obj) {
            return (obj instanceof Invalid) && hatchCardFieldFailure == ((Invalid) obj).failure;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1843toStringimpl(HatchCardFieldFailure hatchCardFieldFailure) {
            return AnonymousClass001.A0v(")", C3cG.A0f(hatchCardFieldFailure, "Invalid(failure="));
        }

        public boolean equals(Object obj) {
            return m1840equalsimpl(this.failure, obj);
        }

        public final HatchCardFieldFailure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return m1843toStringimpl(this.failure);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ HatchCardFieldFailure m1844unboximpl() {
            return this.failure;
        }

        public /* synthetic */ Invalid(HatchCardFieldFailure hatchCardFieldFailure) {
            this.failure = hatchCardFieldFailure;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1841equalsimpl0(HatchCardFieldFailure hatchCardFieldFailure, HatchCardFieldFailure hatchCardFieldFailure2) {
            return AnonymousClass002.A1Z(hatchCardFieldFailure, hatchCardFieldFailure2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1842hashCodeimpl(HatchCardFieldFailure hatchCardFieldFailure) {
            return hatchCardFieldFailure.hashCode();
        }
    }

    public final class Pending implements HatchCardFieldState {
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public String toString() {
            return "Pending";
        }

        public int hashCode() {
            return -2004916708;
        }
    }

    /* loaded from: classes4.dex */
    public final class Valid implements HatchCardFieldState {
        public static final Valid INSTANCE = new Valid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Valid);
        }

        public String toString() {
            return "Valid";
        }

        public int hashCode() {
            return -729626175;
        }
    }
}
