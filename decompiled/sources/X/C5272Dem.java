package X;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import androidx.health.platform.client.service.IHealthDataService;
import androidx.health.platform.client.service.IHealthDataService$Stub$Proxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.Dem, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5272Dem implements InterfaceC5283Dey {
    public final Context A00;
    public final InterfaceC5282Dex<S> A01;
    public final InterfaceC5270Dek<S, Integer> A02;
    public final C5281Dew A03;
    public final C5285Df0 A04;
    public final String A05;
    public volatile int A06;

    public C5272Dem(Context context) {
        C5285Df0 c5285Df0;
        synchronized (C5279Deu.A01) {
            c5285Df0 = C5279Deu.A00;
            if (c5285Df0 == null) {
                Context applicationContext = context.getApplicationContext();
                Looper looper = BV5.A0C("ProviderConnectionManager", 9).getLooper();
                C7384Etj.A0U(looper);
                c5285Df0 = new C5285Df0(applicationContext, looper);
                C5279Deu.A00 = c5285Df0;
            }
            C7384Etj.A0X(c5285Df0);
        }
        InterfaceC5282Dex<S> interfaceC5282Dex = new InterfaceC5282Dex() { // from class: X.Dev
        };
        InterfaceC5270Dek<S, Integer> interfaceC5270Dek = new InterfaceC5270Dek() { // from class: X.Dej
            @Override // X.InterfaceC5270Dek
            public final Integer AAx(Object obj) {
                IHealthDataService$Stub$Proxy iHealthDataService$Stub$Proxy = (IHealthDataService$Stub$Proxy) ((IHealthDataService) obj);
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    BV7.A1A(iHealthDataService$Stub$Proxy.A00, parcelObtain, parcelObtain2, 1);
                    int i = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        };
        this.A06 = -1;
        this.A03 = new C5281Dew(new C5275Dep(this, interfaceC5282Dex, interfaceC5270Dek));
        this.A04 = c5285Df0;
        this.A01 = interfaceC5282Dex;
        this.A02 = interfaceC5270Dek;
        this.A00 = context;
        this.A05 = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.health.platform.client.request.RequestContext A00(X.C5272Dem r6) {
        /*
            java.lang.String r5 = r6.A05
            X.C7384Etj.A0T(r5)
            android.content.Context r1 = r6.A00
            java.lang.String r0 = "PermissionTokenManager.healthdata"
            android.content.SharedPreferences r2 = X.BV4.A07(r1, r0)
            java.lang.String r1 = "token"
            r0 = 0
            java.lang.String r4 = r2.getString(r1, r0)
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r3 = r0.importance
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 100
            if (r3 == r0) goto L2c
            r0 = 125(0x7d, float:1.75E-43)
            if (r3 == r0) goto L2c
            r2 = 0
            if (r3 != r1) goto L2d
        L2c:
            r2 = 1
        L2d:
            r1 = 112(0x70, float:1.57E-43)
            androidx.health.platform.client.request.RequestContext r0 = new androidx.health.platform.client.request.RequestContext
            r0.<init>(r5, r1, r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5272Dem.A00(X.Dem):androidx.health.platform.client.request.RequestContext");
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(ILX/Dei<TS;TR;>;)Lcom/google/common/util/concurrent/ListenableFuture<TR;>; */
    /* JADX WARN: Type inference failed for: r2v1, types: [F, X.F5N] */
    public final SettableFuture A01(InterfaceC5268Dei interfaceC5268Dei, int i) {
        ListenableFuture cpz;
        SettableFuture settableFuture = new SettableFuture();
        if (this.A06 != -1) {
            cpz = new CPZ(Integer.valueOf(this.A06));
        } else {
            final InterfaceC5270Dek<S, Integer> interfaceC5270Dek = this.A02;
            InterfaceC5268Dei interfaceC5268Dei2 = new InterfaceC5268Dei() { // from class: X.Del
                @Override // X.InterfaceC5268Dei
                public final void AB0(SettableFuture settableFuture2, Object obj) {
                    settableFuture2.set(interfaceC5270Dek.AAx(obj));
                }
            };
            SettableFuture settableFuture2 = new SettableFuture();
            C5285Df0 c5285Df0 = this.A04;
            BV4.A1D(c5285Df0.A01, new C5274Deo(this, interfaceC5268Dei2, this.A03, settableFuture2), 3);
            ?? f5n = new F5N(this, 0);
            EnumC3451CNw enumC3451CNw = EnumC3451CNw.A01;
            RunnableC3444CNp runnableC3444CNp = new RunnableC3444CNp();
            runnableC3444CNp.A00 = settableFuture2;
            runnableC3444CNp.A01 = f5n;
            settableFuture2.addListener(runnableC3444CNp, enumC3451CNw);
            cpz = runnableC3444CNp;
        }
        CQD.A01(new C5273Den(this, interfaceC5268Dei, settableFuture, i), cpz, EnumC3451CNw.A01);
        return settableFuture;
    }
}
