package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.DmF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5631DmF implements InterfaceC5756Dor {
    public final CopyOnWriteArraySet<InterfaceC5756Dor> A00;
    public final Handler A01;
    public final HeroPlayerSetting A02;

    @Override // X.InterfaceC5756Dor
    public final void ASV(String str, boolean z, long j) {
        this.A01.post(new Dp8(this, str, j, z));
    }

    @Override // X.InterfaceC5756Dor
    public final void ASc(C5723DoI c5723DoI, long j, String str, List<String> list, boolean z) {
        this.A01.post(new Do7(this, c5723DoI, str, list, j, z));
    }

    @Override // X.InterfaceC5756Dor
    public final void ATq(byte[] bArr, String str, long j, long j2) {
        this.A01.post(new RunnableC5761Dow(this, str, bArr, j, j2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUc(C5623Dm6 c5623Dm6, Dq8 dq8, C6060Duv c6060Duv, C5790DpZ c5790DpZ, String str) {
        this.A01.post(new Do6(this, c6060Duv, c5790DpZ, dq8, c5623Dm6, str));
    }

    @Override // X.InterfaceC5756Dor
    public final void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
        this.A01.post(new RunnableC5762Dox(this, str, bArr, j));
    }

    public static Iterator A00(C5631DmF c5631DmF) {
        return c5631DmF.A00.iterator();
    }

    @Override // X.InterfaceC5756Dor
    public final void ARl(int i) {
        this.A01.post(new RunnableC5769DpB(this, i));
    }

    @Override // X.InterfaceC5756Dor
    public final void ARq(final C5723DoI c5723DoI) {
        this.A01.post(new Runnable() { // from class: X.Dpj
            public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C5631DmF c5631DmF = this.A00;
                C5723DoI c5723DoI2 = c5723DoI;
                Iterator itA00 = C5631DmF.A00(c5631DmF);
                while (itA00.hasNext()) {
                    BV6.A0a(itA00).ARq(c5723DoI2);
                }
            }
        });
    }

    @Override // X.InterfaceC5756Dor
    public final void ASF(String str, boolean z) {
        this.A01.post(new RunnableC5768DpA(this, str, z));
    }

    @Override // X.InterfaceC5756Dor
    public final void ASG(String str, boolean z) {
        this.A01.post(new Dp9(this, str, z));
    }

    @Override // X.InterfaceC5756Dor
    public final void ASi(C5919Ds4 c5919Ds4) {
        this.A01.post(new RunnableC5758Dot(this, c5919Ds4));
    }

    @Override // X.InterfaceC5756Dor
    public final void AT7(C5790DpZ c5790DpZ, String str, String str2, String str3, long j) {
        this.A01.post(new RunnableC5764Doz(this, c5790DpZ, str, str2, str3, j));
    }

    @Override // X.InterfaceC5756Dor
    public final void ATQ() {
        this.A01.post(new RunnableC5781DpP(this));
    }

    @Override // X.InterfaceC5756Dor
    public final void ATS(String str, long j) {
        if (!this.A02.enableMoveOffListenerDispatcher) {
            this.A01.post(new RunnableC5774DpG(this, str, j));
            return;
        }
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ATS(str, j);
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ATa(C5892DrZ c5892DrZ) {
        this.A01.post(new RunnableC5754Dop(this, c5892DrZ));
    }

    @Override // X.InterfaceC5756Dor
    public final void ATm(String str, long j, long j2, long j3, long j4) {
        this.A01.post(new Dp5(this, str, j, j2, j3, j4));
    }

    @Override // X.InterfaceC5756Dor
    public final void ATp(boolean z) {
        this.A01.post(new RunnableC5771DpD(this, z));
    }

    @Override // X.InterfaceC5756Dor
    public final void ATs(C5841DqX c5841DqX) {
        this.A01.post(new RunnableC5765Dp1(this, c5841DqX));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUB(Object obj) {
        this.A01.post(new RunnableC5772DpE(this, obj));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUI(byte[] bArr, long j) {
        this.A01.post(new RunnableC5760Dov(this, bArr, j));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUK(byte[] bArr) {
        this.A01.post(new Dp0(this, bArr));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUU(String str, String str2) {
        this.A01.post(new RunnableC5773DpF(this, str, str2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUb() {
        this.A01.post(new RunnableC5784DpS(this));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUd(final EnumC2375BWj enumC2375BWj) {
        this.A01.post(new Runnable() { // from class: X.Dpl
            public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                C5631DmF c5631DmF = this.A00;
                EnumC2375BWj enumC2375BWj2 = enumC2375BWj;
                Iterator itA00 = C5631DmF.A00(c5631DmF);
                while (itA00.hasNext()) {
                    BV6.A0a(itA00).AUd(enumC2375BWj2);
                }
            }
        });
    }

    @Override // X.InterfaceC5756Dor
    public final void AUg(C5623Dm6 c5623Dm6, float f, long j) {
        this.A01.post(new RunnableC5738DoZ(this, c5623Dm6, f, j));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUw(C5623Dm6 c5623Dm6, String str) {
        this.A01.post(new RunnableC5766Dp2(this, c5623Dm6, str));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUx() {
        this.A01.post(new RunnableC5783DpR(this));
    }

    @Override // X.InterfaceC5756Dor
    public final void AVg(long j, long j2) {
        this.A01.post(new Dp7(this, j, j2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AVh(long j, String str) {
        this.A01.post(new Dp6(this, str, j));
    }

    @Override // X.InterfaceC5756Dor
    public final void AW9(Dq8 dq8, C5623Dm6 c5623Dm6, String str, long j, boolean z, boolean z2) {
        this.A01.post(new RunnableC5740Dob(this, dq8, c5623Dm6, str, j, z, z2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AWG(C5623Dm6 c5623Dm6, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A01.post(new RunnableC5767Dp3(this, c5623Dm6, j, j2, z, z2, z3));
    }

    @Override // X.InterfaceC5756Dor
    public final void AWK(final C6060Duv c6060Duv) {
        this.A01.post(new Runnable() { // from class: X.Dpk
            public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                C5631DmF c5631DmF = this.A00;
                C6060Duv c6060Duv2 = c6060Duv;
                Iterator itA00 = C5631DmF.A00(c5631DmF);
                while (itA00.hasNext()) {
                    BV6.A0a(itA00).AWK(c6060Duv2);
                }
            }
        });
    }

    @Override // X.InterfaceC5756Dor
    public final void AWL(boolean z) {
        this.A01.post(new RunnableC5770DpC(this, z));
    }

    @Override // X.InterfaceC5756Dor
    public final void AWZ(List<DwN> list) {
        this.A01.post(new RunnableC5759Dou(this, list));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DoI;LX/DoI;JLjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;LX/DpZ;)V */
    @Override // X.InterfaceC5756Dor
    public final void AWc(C5790DpZ c5790DpZ, C5723DoI c5723DoI, C5723DoI c5723DoI2, String str, String str2, List list, long j) {
        this.A01.post(new RunnableC5726DoL(this, c5790DpZ, c5723DoI, c5723DoI2, str, str2, list, j));
    }

    @Override // X.InterfaceC5756Dor
    public final void AX3(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01.post(new DoY(this, dq8, c5623Dm6, str, str2, str3, str4, j, z));
    }

    @Override // X.InterfaceC5756Dor
    public final void AX4(C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01.post(new Do8(this, c6060Duv, dq8, c5623Dm6, num, str, str2, str3, z, z2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AX8(String str, String str2) {
        this.A01.post(new Dp4(this, str, str2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXB(C5790DpZ c5790DpZ) {
        this.A01.post(new RunnableC5757Dos(this, c5790DpZ));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXD(C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, boolean z2) {
        this.A01.post(new Do5(this, c6060Duv, dq8, c5623Dm6, num, str, str2, str3, str4, str5, j, j2, z, z2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXE(C5623Dm6 c5623Dm6) {
        this.A01.post(new RunnableC5753Doo(this, c5623Dm6));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXF() {
        this.A01.post(new RunnableC5782DpQ(this));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXG(int i, int i2, float f) {
        this.A01.post(new RunnableC5751Dom(this, f, i, i2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXL(boolean z, boolean z2) {
        this.A01.post(new RunnableC5775DpH(this, z, z2));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXP(C5790DpZ c5790DpZ) {
        this.A01.post(new RunnableC5755Doq(this, c5790DpZ));
    }

    @Override // X.InterfaceC5756Dor
    public final void onCues(List<DXC> list) {
        this.A01.post(new RunnableC5752Don(this, list));
    }

    @Override // X.InterfaceC5756Dor
    public final void onIsLoadingChanged(final boolean z) {
        this.A01.post(new Runnable() { // from class: X.Dq0
            public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                C5631DmF c5631DmF = this.A00;
                boolean z2 = z;
                Iterator itA00 = C5631DmF.A00(c5631DmF);
                while (itA00.hasNext()) {
                    BV6.A0a(itA00).onIsLoadingChanged(z2);
                }
            }
        });
    }

    @Override // X.InterfaceC5756Dor
    public final void onVolumeChanged(float f) {
        this.A01.post(new RunnableC5763Doy(this, f));
    }

    public C5631DmF(Handler handler, InterfaceC5756Dor interfaceC5756Dor, HeroPlayerSetting heroPlayerSetting) {
        this.A01 = handler;
        CopyOnWriteArraySet<InterfaceC5756Dor> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.A00 = copyOnWriteArraySet;
        copyOnWriteArraySet.add(interfaceC5756Dor);
        this.A02 = heroPlayerSetting;
    }

    @Override // X.InterfaceC5756Dor
    public final void ARz(final String str, final long j) {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            final InterfaceC5756Dor interfaceC5756DorA0a = BV6.A0a(itA00);
            this.A01.post(new Runnable() { // from class: X.Dsi
                public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC5756DorA0a.ARz(str, j);
                }
            });
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXI(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AXJ(c5623Dm6);
        }
        this.A01.post(new RunnableC5739Doa(this, dq8, c5623Dm6, str, str2, str3, str4, str5, str6, str7, j, z, z2));
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AXJ(C5623Dm6 c5623Dm6) {
    }
}
