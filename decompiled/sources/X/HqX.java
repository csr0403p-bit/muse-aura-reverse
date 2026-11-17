package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.google.common.base.Objects;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class HqX implements Serializable {
    public static final long serialVersionUID = 0;
    public final boolean hasBracketlessColons;
    public final String host;
    public final int port;

    public final boolean equals(Object other) {
        if (this != other) {
            if (other instanceof HqX) {
                HqX hqX = (HqX) other;
                if (!Objects.equal(this.host, hqX.host) || this.port != hqX.port) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(this.host, Integer.valueOf(this.port));
    }

    public final String toString() {
        String str = this.host;
        StringBuilder sbA0p = BV4.A0p(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            sbA0p.append('[');
            sbA0p.append(str);
            sbA0p.append(']');
        } else {
            sbA0p.append(str);
        }
        int i = this.port;
        if (i >= 0) {
            sbA0p.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
            sbA0p.append(i);
        }
        return sbA0p.toString();
    }

    public HqX(String host, int port, boolean hasBracketlessColons) {
        this.host = host;
        this.port = port;
        this.hasBracketlessColons = hasBracketlessColons;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.HqX A00(java.lang.String r11) throws java.lang.NumberFormatException {
        /*
            r11.getClass()
            java.lang.String r0 = "["
            boolean r0 = r11.startsWith(r0)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L99
            char r1 = r11.charAt(r6)
            r0 = 91
            boolean r1 = X.AnonymousClass002.A1Q(r1, r0)
            java.lang.String r0 = "Bracketed host-port string must start with a bracket: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r11)
            r10 = 58
            int r3 = r11.indexOf(r10)
            r0 = 93
            int r2 = r11.lastIndexOf(r0)
            if (r3 <= r4) goto L2e
            r1 = 1
            if (r2 > r3) goto L2f
        L2e:
            r1 = 0
        L2f:
            java.lang.String r0 = "Invalid bracketed host/port: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r11)
            java.lang.String r9 = r11.substring(r5, r2)
            int r0 = r2 + 1
            int r8 = r11.length()
            r7 = 2
            if (r0 != r8) goto L6e
            java.lang.String[] r1 = new java.lang.String[r7]
            r1[r6] = r9
            java.lang.String r0 = ""
        L47:
            r1[r5] = r0
            r3 = r1[r6]
            r2 = r1[r5]
        L4d:
            r0 = 0
            if (r2 == 0) goto Ld0
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto Ld0
            java.lang.String r1 = "+"
            boolean r1 = r2.startsWith(r1)
            if (r1 != 0) goto L6c
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.Ascii.INSTANCE
            boolean r1 = r1.matchesAllOf(r2)
            if (r1 == 0) goto L6c
        L66:
            java.lang.String r1 = "Unparseable port number: %s"
            com.google.common.base.Preconditions.checkArgument(r5, r1, r11)
            goto Lb2
        L6c:
            r5 = 0
            goto L66
        L6e:
            char r0 = r11.charAt(r0)
            boolean r1 = X.AnonymousClass002.A1Q(r0, r10)
            java.lang.String r0 = "Only a colon may follow a close bracket: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r11)
            int r3 = r2 + 2
            r2 = r3
        L7e:
            if (r2 >= r8) goto L90
            char r0 = r11.charAt(r2)
            boolean r1 = java.lang.Character.isDigit(r0)
            java.lang.String r0 = "Port must be numeric: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r11)
            int r2 = r2 + 1
            goto L7e
        L90:
            java.lang.String r0 = r11.substring(r3)
            java.lang.String[] r1 = new java.lang.String[r7]
            r1[r6] = r9
            goto L47
        L99:
            r0 = 58
            int r2 = r11.indexOf(r0)
            if (r2 < 0) goto Lcc
            int r1 = r2 + 1
            int r0 = r11.indexOf(r0, r1)
            if (r0 != r4) goto Lce
            java.lang.String r3 = r11.substring(r6, r2)
            java.lang.String r2 = r11.substring(r1)
            goto L4d
        Lb2:
            int r4 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Lc5
            if (r4 < 0) goto Lbe
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = 1
            if (r4 <= r1) goto Lbf
        Lbe:
            r2 = 0
        Lbf:
            java.lang.String r1 = "Port number out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r1, r11)
            goto Ld0
        Lc5:
            java.lang.String r0 = "Unparseable port number: "
            java.lang.IllegalArgumentException r0 = X.C60Q.A0U(r0, r11)
            throw r0
        Lcc:
            r0 = 0
            goto Lcf
        Lce:
            r0 = 1
        Lcf:
            r3 = r11
        Ld0:
            X.HqX r1 = new X.HqX
            r1.<init>(r3, r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HqX.A00(java.lang.String):X.HqX");
    }
}
