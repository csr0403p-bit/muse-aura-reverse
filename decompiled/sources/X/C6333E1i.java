package X;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* renamed from: X.E1i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6333E1i {
    public final int A00;
    public final int A01;
    public final int A02;
    public static final Pattern A07 = Pattern.compile("\\s+");
    public static final ImmutableSet<String> A06 = ImmutableSet.A03(new Object[]{"auto", "none"}, 2);
    public static final ImmutableSet<String> A04 = ImmutableSet.A03(new Object[]{"dot", "sesame", "circle"}, 3);
    public static final ImmutableSet<String> A03 = ImmutableSet.A03(new Object[]{"filled", "open"}, 2);
    public static final ImmutableSet<String> A05 = ImmutableSet.A03(new Object[]{"after", "before", "outside"}, 3);

    public C6333E1i(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }
}
