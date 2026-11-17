package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FBW implements InterfaceC10551Hsc {
    public final /* synthetic */ C7718FBu A00;
    public final /* synthetic */ FBQ A01;
    public final /* synthetic */ FC6 A02;
    public final /* synthetic */ AbstractC7712FBk A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map<String, HxE<Boolean, HxE<HkK, Hr8>>> A05;
    public final /* synthetic */ Map<String, C7403Euh> A06;
    public final /* synthetic */ Executor A07;
    public final /* synthetic */ G0U<HoL, Unit> A08;
    public final /* synthetic */ G0U<List<F9A>, Unit> A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: Incorrect types in method signature: (LX/FC6;LX/FBQ;Ljava/util/Map<Ljava/lang/String;LX/HxE<Ljava/lang/Boolean;LX/HxE<LX/HkK;LX/Hr8;>;>;>;Ljava/lang/String;LX/FBu;ZLX/FBk;LX/G0U<-Ljava/util/List<LX/F9A;>;Lkotlin/Unit;>;Ljava/util/Map<Ljava/lang/String;LX/Euh;>;LX/G0U<-LX/HoL;Lkotlin/Unit;>;Ljava/util/concurrent/Executor;)V */
    public FBW(C7718FBu c7718FBu, FBQ fbq, FC6 fc6, AbstractC7712FBk abstractC7712FBk, String str, Map map, Map map2, Executor executor, G0U g0u, G0U g0u2, boolean z) {
        this.A02 = fc6;
        this.A01 = fbq;
        this.A05 = map;
        this.A04 = str;
        this.A00 = c7718FBu;
        this.A0A = z;
        this.A03 = abstractC7712FBk;
        this.A09 = g0u;
        this.A06 = map2;
        this.A08 = g0u2;
        this.A07 = executor;
    }
}
