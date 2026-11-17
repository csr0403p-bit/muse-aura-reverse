package com.facebook.aura.commands.photos;

import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes5.dex */
public interface PhotoLabelResult {

    public final class Failed implements PhotoLabelResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -2078311403;
        }
    }

    public final class Labels implements PhotoLabelResult {
        public final List<String> values;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static List<? extends String> m354constructorimpl(List<String> list) {
            C7384Etj.A0Y(list, 0);
            return list;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Labels m353boximpl(List list) {
            return new Labels(list);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m355equalsimpl(List<? extends String> list, Object obj) {
            return (obj instanceof Labels) && C7384Etj.areEqual(list, ((Labels) obj).values);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m358toStringimpl(List<? extends String> list) {
            return C3cJ.A0M("Labels(values=", list);
        }

        public boolean equals(Object obj) {
            return m355equalsimpl(this.values, obj);
        }

        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Labels(values=", this.values);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ List m359unboximpl() {
            return this.values;
        }

        public /* synthetic */ Labels(List list) {
            this.values = list;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m356equalsimpl0(List<? extends String> list, List<? extends String> list2) {
            return C7384Etj.areEqual(list, list2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m357hashCodeimpl(List<? extends String> list) {
            return list.hashCode();
        }
    }

    public final class ModelNotReady implements PhotoLabelResult {
        public static final ModelNotReady INSTANCE = new ModelNotReady();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ModelNotReady);
        }

        public String toString() {
            return "ModelNotReady";
        }

        public int hashCode() {
            return 939935233;
        }
    }
}
