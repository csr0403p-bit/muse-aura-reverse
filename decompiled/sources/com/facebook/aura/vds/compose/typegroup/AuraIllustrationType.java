package com.facebook.aura.vds.compose.typegroup;

import X.AnonymousClass002;
import X.B6A;
import X.C06H;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "AuraIllustrationType is deprecated. Use AuraIconTint for AuraIcon or color parameters for AuraImage.", replaceWith = @ReplaceWith(expression = "AuraIconTint", imports = {}))
/* loaded from: classes.dex */
public abstract class AuraIllustrationType {
    public static final int $stable = 8;

    public final class Icon extends AuraIllustrationType {
        public static final int $stable = 0;
        public final long tint;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Icon) {
                    long j = this.tint;
                    long j2 = ((Icon) obj).tint;
                    long j3 = B6A.A01;
                    if (j == j2) {
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Icon m3102copy8_81llA$default(Icon icon, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = icon.tint;
            }
            return new Icon(j);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m3103component10d7_KjU() {
            return this.tint;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Icon m3104copy8_81llA(long j) {
            return new Icon(j);
        }

        /* renamed from: getTint-0d7_KjU, reason: not valid java name */
        public final long m3105getTint0d7_KjU() {
            return this.tint;
        }

        public int hashCode() {
            long j = this.tint;
            long j2 = B6A.A01;
            return AnonymousClass002.A0A(j);
        }

        public /* synthetic */ Icon(long j, C06H c06h) {
            this(j);
        }

        public String toString() {
            return super.toString();
        }

        public Icon(long j) {
            this.tint = j;
        }
    }

    public final class Image extends AuraIllustrationType {
        public static final int $stable = 0;
        public static final Image INSTANCE = new Image();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Image);
        }

        public String toString() {
            return "Image";
        }

        public int hashCode() {
            return -1029819112;
        }
    }

    public /* synthetic */ AuraIllustrationType(C06H c06h) {
    }

    public AuraIllustrationType() {
    }
}
