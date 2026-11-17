package X;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EIQ {
    public final Context A02;
    public final Intent A03;
    public final EEj A04;
    public final InterfaceC6586EIe A05;
    public final InterfaceC6553EEo A06;
    public final File A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final List<EN5> A0B;
    public final List<AbstractC6555EEr> A0C;
    public final List<Object> A0D;
    public final Set<Integer> A0E;
    public final Callable<InputStream> A0F;
    public final Executor A0G;
    public final Executor A0H;
    public final C78T A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public boolean A01 = true;
    public int A00 = 25;

    public EIQ(Context context, Intent intent, EEj eEj, InterfaceC6586EIe interfaceC6586EIe, InterfaceC6553EEo interfaceC6553EEo, File file, Integer num, String str, String str2, List list, List list2, List list3, Set set, Callable callable, Executor executor, Executor executor2, C78T c78t, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = context;
        this.A0A = str;
        this.A06 = interfaceC6553EEo;
        this.A04 = eEj;
        this.A0C = list;
        this.A0L = z;
        this.A08 = num;
        this.A0G = executor;
        this.A0H = executor2;
        this.A03 = intent;
        this.A0M = z2;
        this.A0K = z3;
        this.A0E = set;
        this.A09 = str2;
        this.A07 = file;
        this.A0F = callable;
        this.A0D = list2;
        this.A0B = list3;
        this.A0J = z4;
        this.A05 = interfaceC6586EIe;
        this.A0I = c78t;
    }
}
