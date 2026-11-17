package X;

/* renamed from: X.Hlb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC10483Hlb {
    public static final long A00(long j, long j2, String str) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long lA0s = C9tI.A0s(property);
                if (lA0s == null) {
                    throw new IllegalStateException(FGI.A0e("System property '", str, "' has unrecognized value '", property, '\''));
                }
                long jLongValue = lA0s.longValue();
                if (1 <= jLongValue && jLongValue <= j2) {
                    return jLongValue;
                }
                StringBuilder sb = new StringBuilder("System property '");
                sb.append(str);
                sb.append("' should be in range ");
                sb.append(1L);
                sb.append("..");
                sb.append(j2);
                sb.append(", but is '");
                sb.append(jLongValue);
                sb.append('\'');
                throw new IllegalStateException(sb.toString());
            }
        } catch (SecurityException unused) {
        }
        return j;
    }
}
