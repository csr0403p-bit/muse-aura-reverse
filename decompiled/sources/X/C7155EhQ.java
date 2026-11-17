package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* renamed from: X.EhQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7155EhQ {
    public ContentResolver A00;
    public AssetManager A01;
    public Resources A02;
    public final InterfaceC7005EeA A03;
    public final C7156EhR<CCV> A04;
    public final C7156EhR<CCV> A05;
    public final DV5 A06;
    public final InterfaceC7121Egb<CCV, InterfaceC7064EfB> A07;
    public final InterfaceC7121Egb A08;
    public final C7069EfP A09;
    public final BXh A0A;
    public final InterfaceC7147EhG A0B;
    public final C7110EgO A0C;
    public final InterfaceC7068EfO A0D;
    public final Eh5 A0E;
    public final C6524EBy A0F;
    public final C7011EeI A0G;
    public final boolean A0H;
    public final AbstractC7151EhM A0I;

    /* JADX WARN: Incorrect types in method signature: (LX/EeM<LX/Edo;>;ZLX/EeD;)LX/EeU; */
    public final C7023EeU A00(InterfaceC7015EeM interfaceC7015EeM, InterfaceC7006EeD interfaceC7006EeD, boolean z) {
        return new C7023EeU(this.A0G, interfaceC7015EeM, interfaceC7006EeD, ((C7120Ega) this.A0B).A00, z);
    }

    public C7155EhQ(Context context, InterfaceC7005EeA interfaceC7005EeA, AbstractC7151EhM abstractC7151EhM, DV5 dv5, InterfaceC7121Egb interfaceC7121Egb, InterfaceC7121Egb interfaceC7121Egb2, C7069EfP c7069EfP, BXh bXh, InterfaceC7147EhG interfaceC7147EhG, C7110EgO c7110EgO, InterfaceC7068EfO interfaceC7068EfO, Eh5 eh5, C6524EBy c6524EBy, C7011EeI c7011EeI, boolean z) {
        this.A0F = c6524EBy;
        this.A0D = interfaceC7068EfO;
        this.A0E = eh5;
        this.A0A = bXh;
        this.A0H = z;
        this.A0B = interfaceC7147EhG;
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        C7384Etj.A0U(contentResolver);
        this.A00 = contentResolver;
        Resources resources = context.getApplicationContext().getResources();
        C7384Etj.A0U(resources);
        this.A02 = resources;
        AssetManager assets = context.getApplicationContext().getAssets();
        C7384Etj.A0U(assets);
        this.A01 = assets;
        this.A0G = c7011EeI;
        this.A07 = interfaceC7121Egb;
        this.A08 = interfaceC7121Egb2;
        this.A03 = interfaceC7005EeA;
        this.A06 = dv5;
        this.A0I = abstractC7151EhM;
        this.A05 = new C7156EhR<>();
        this.A04 = new C7156EhR<>();
        this.A09 = c7069EfP;
        this.A0C = c7110EgO;
    }
}
