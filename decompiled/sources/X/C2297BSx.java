package X;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.PolymorphicSerializer;
import org.maplibre.android.R;

/* renamed from: X.BSx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2297BSx implements Ht9, G0U {
    public final int $t;
    public final Object A00;

    public C2297BSx(C1943Aug c1943Aug, int i) {
        this.$t = i;
        switch (i) {
            case 3:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                this.A00 = c1943Aug;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                this.A00 = c1943Aug;
                break;
        }
    }

    public static C2297BSx A00(Object obj, int i) {
        return new C2297BSx(obj, i);
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        long j;
        boolean zA5t;
        Object objAbb;
        Hm1<? super Unit> hm1;
        Hm1<? super Unit> hm12;
        C1943Aug c1943Aug;
        InterfaceC1497Ak4 interfaceC1497Ak4;
        AaC aaCA0f;
        long j2;
        float fA01;
        InterfaceC1497Ak4 interfaceC1497Ak4A01;
        InterfaceC1497Ak4 interfaceC1497Ak4A012;
        InterfaceC1497Ak4 interfaceC1497Ak4A013;
        InterfaceC1497Ak4 interfaceC1497Ak4A014;
        C1962AvE c1962AvE;
        C1962AvE c1962AvE2;
        switch (this.$t) {
            case 0:
                C1945Auj c1945Auj = (C1945Auj) this.A00;
                String str = ((ApQ) obj).A00;
                C1963AvF c1963AvF = c1945Auj.A03;
                if (c1963AvF == null) {
                    C1963AvF c1963AvF2 = new C1963AvF(c1945Auj.A08, str);
                    C1948Aum c1948Aum = new C1948Aum(c1945Auj.A06, c1945Auj.A07, str, c1945Auj.A02, c1945Auj.A00, c1945Auj.A01, c1945Auj.A0A);
                    c1948Aum.A04(C1945Auj.A00(c1945Auj).A0B);
                    c1963AvF2.A00 = c1948Aum;
                    c1945Auj.A03 = c1963AvF2;
                } else if (!C7384Etj.areEqual(str, c1963AvF.A01)) {
                    c1963AvF.A01 = str;
                    C1948Aum c1948Aum2 = c1963AvF.A00;
                    if (c1948Aum2 != null) {
                        AbstractC1439Aj8.A0H(c1948Aum2, c1945Auj, c1945Auj.A06, str);
                    }
                }
                AaW.A00(c1945Auj);
                AbstractC1339AhQ.A00(c1945Auj);
                AaD.A00(c1945Auj);
                return AnonymousClass001.A0i();
            case 1:
                C1945Auj c1945Auj2 = (C1945Auj) this.A00;
                boolean zA1X = AnonymousClass001.A1X(obj);
                C1963AvF c1963AvF3 = c1945Auj2.A03;
                if (c1963AvF3 != null) {
                    c1963AvF3.A02 = zA1X;
                    AaW.A00(c1945Auj2);
                    AbstractC1339AhQ.A00(c1945Auj2);
                    AaD.A00(c1945Auj2);
                    return Boolean.valueOf(zA5t);
                }
                zA5t = false;
                return Boolean.valueOf(zA5t);
            case 2:
                AYU.A02((AYU) obj, (AZE) this.A00);
                return Unit.INSTANCE;
            case 3:
                return new BSM(this.A00, 10);
            case 4:
                ((MutableState) this.A00).Af8(obj);
                return Unit.INSTANCE;
            case 5:
                C1299Agk c1299Agk = (C1299Agk) obj;
                if (((InterfaceC2076Axr) this.A00).ATF(c1299Agk.A0A)) {
                    c1299Agk.A02();
                }
                return Unit.INSTANCE;
            case 6:
            case 7:
                C1299Agk c1299Agk2 = (C1299Agk) obj;
                ((InterfaceC2045AxD) this.A00).ASf(AbstractC1078AXh.A00(c1299Agk2));
                c1299Agk2.A02();
                return Unit.INSTANCE;
            case 8:
                F1F f1f = (F1F) this.A00;
                if (C8j3.A0I(((AvA) obj).A05.A04.A03) > 0) {
                    f1f.element = false;
                }
                return Unit.INSTANCE;
            case 9:
                C1943Aug c1943Aug2 = (C1943Aug) this.A00;
                if (((AXH) c1943Aug2.A0D.A0A.getValue()).A06(C3cG.A05(obj))) {
                    c1943Aug2.A0B();
                    c1943Aug2.A0F.Af8(null);
                }
                return Unit.INSTANCE;
            case 10:
                c1943Aug = (C1943Aug) this.A00;
                long jA05 = C3cG.A05(obj);
                MutableState<C1940Aud> mutableState = c1943Aug.A0F;
                C1940Aud value = mutableState.getValue();
                if (value != null && (c1962AvE2 = value.A01) != null && jA05 == c1962AvE2.A01) {
                    c1943Aug.A0N.Af8(null);
                }
                C1940Aud value2 = mutableState.getValue();
                if (value2 != null && (c1962AvE = value2.A00) != null && jA05 == c1962AvE.A01) {
                    c1943Aug.A0K.Af8(null);
                }
                if (((AXH) c1943Aug.A0D.A0A.getValue()).A06(jA05)) {
                    C1943Aug.A05(c1943Aug);
                }
                return Unit.INSTANCE;
            case 11:
                c1943Aug = (C1943Aug) this.A00;
                InterfaceC1497Ak4 interfaceC1497Ak42 = (InterfaceC1497Ak4) obj;
                c1943Aug.A06 = interfaceC1497Ak42;
                if (MutableState.A0A(c1943Aug.A0L) && c1943Aug.A0F.getValue() != null) {
                    AWx aWxA0B = interfaceC1497Ak42 != null ? AWx.A0B(interfaceC1497Ak42.APr(0L)) : null;
                    if (!C7384Etj.areEqual(c1943Aug.A04, aWxA0B)) {
                        c1943Aug.A04 = aWxA0B;
                        C1943Aug.A04(c1943Aug);
                        C1943Aug.A05(c1943Aug);
                    }
                }
                return Unit.INSTANCE;
            case 12:
                C1943Aug c1943Aug3 = (C1943Aug) this.A00;
                C2Um c2Um = (C2Um) obj;
                if (!c2Um.AG5() && MutableState.A0A(c1943Aug3.A0L)) {
                    c1943Aug3.A0B();
                }
                MutableState.A09(c2Um.AG5(), c1943Aug3.A0L);
                return Unit.INSTANCE;
            case 13:
                C1943Aug.A06((C1943Aug) this.A00, AnonymousClass001.A1X(obj));
                return Unit.INSTANCE;
            case 14:
                C1943Aug c1943Aug4 = (C1943Aug) this.A00;
                interfaceC1497Ak4 = (InterfaceC1497Ak4) obj;
                aaCA0f = (AaC) c1943Aug4.A0O.getValue();
                if (aaCA0f == null) {
                    return null;
                }
                InterfaceC1497Ak4 interfaceC1497Ak4A015 = c1943Aug4.A06;
                if (interfaceC1497Ak4A015 == null) {
                    throw C3cG.A0Q("Required value was null.");
                }
                return AbstractC1675AoC.A00(aaCA0f, interfaceC1497Ak4A015, interfaceC1497Ak4);
            case 15:
                C1943Aug c1943Aug5 = (C1943Aug) this.A00;
                c1943Aug5.A0F.Af8(obj);
                if (obj != null) {
                    C1943Aug.A04(c1943Aug5);
                }
                return Unit.INSTANCE;
            case 16:
                c1943Aug = (C1943Aug) this.A00;
                if (((AXH) c1943Aug.A0D.A0A.getValue()).A06(C3cG.A05(obj))) {
                    c1943Aug.A0M.Af8(Unit.INSTANCE);
                    C1943Aug.A04(c1943Aug);
                    C1943Aug.A05(c1943Aug);
                }
                return Unit.INSTANCE;
            case 17:
                KeyEvent keyEvent = ((C2AA) obj).A00;
                C1943Aug c1943Aug6 = (C1943Aug) this.A00;
                if (AbstractC2145AzO.A00.AQ4(keyEvent) == EnumC10381HaL.A03) {
                    c1943Aug6.A0A();
                    return Boolean.valueOf(zA5t);
                }
                zA5t = false;
                return Boolean.valueOf(zA5t);
            case 18:
            case 20:
                return ((Function0) this.A00).invoke();
            case 19:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.A00;
                interfaceC1497Ak4 = (InterfaceC1497Ak4) obj;
                C1897AtH c1897AtH = textFieldSelectionManager.A03;
                if (c1897AtH == null || c1897AtH.A06) {
                    aaCA0f = AaC.A04;
                } else {
                    InterfaceC2128Ayu interfaceC2128Ayu = textFieldSelectionManager.A0C;
                    MutableState<C1805ArO> mutableState2 = textFieldSelectionManager.A0S;
                    int iOriginalToTransformed = interfaceC2128Ayu.originalToTransformed((int) (C8j4.A0O(mutableState2) >> 32));
                    int iOriginalToTransformed2 = textFieldSelectionManager.A0C.originalToTransformed(AnonymousClass002.A09(C8j4.A0O(mutableState2)));
                    C1897AtH c1897AtH2 = textFieldSelectionManager.A03;
                    long jAPo = (c1897AtH2 == null || (interfaceC1497Ak4A014 = c1897AtH2.A01()) == null) ? 0L : interfaceC1497Ak4A014.APo(textFieldSelectionManager.A06(true));
                    C1897AtH c1897AtH3 = textFieldSelectionManager.A03;
                    long jAPo2 = (c1897AtH3 == null || (interfaceC1497Ak4A013 = c1897AtH3.A01()) == null) ? 0L : interfaceC1497Ak4A013.APo(textFieldSelectionManager.A06(false));
                    C1897AtH c1897AtH4 = textFieldSelectionManager.A03;
                    float fA012 = 0.0f;
                    if (c1897AtH4 == null || (interfaceC1497Ak4A012 = c1897AtH4.A01()) == null) {
                        j2 = 4294967295L;
                        fA01 = 0.0f;
                    } else {
                        C1924Atl c1924AtlA00 = C1897AtH.A00(c1897AtH);
                        float f = c1924AtlA00 != null ? c1924AtlA00.A02.A06(iOriginalToTransformed).A03 : 0.0f;
                        j2 = 4294967295L;
                        fA01 = AnonymousClass001.A01(interfaceC1497Ak4A012.APo((Float.floatToRawIntBits(f) & 4294967295L) | (C8j3.A0P(0.0f) << 32)), 4294967295L);
                    }
                    C1897AtH c1897AtH5 = textFieldSelectionManager.A03;
                    if (c1897AtH5 != null && (interfaceC1497Ak4A01 = c1897AtH5.A01()) != null) {
                        C1924Atl c1924AtlA002 = C1897AtH.A00(c1897AtH);
                        fA012 = AnonymousClass001.A01(interfaceC1497Ak4A01.APo(AnonymousClass005.A0L(0.0f, c1924AtlA002 != null ? c1924AtlA002.A02.A06(iOriginalToTransformed2).A03 : 0.0f)), j2);
                    }
                    float fA00 = AnonymousClass001.A00(jAPo);
                    float fA002 = AnonymousClass001.A00(jAPo2);
                    aaCA0f = C8j3.A0f(Math.min(fA00, fA002), Math.min(fA01, fA012), Math.max(fA00, fA002), Math.max(AnonymousClass001.A01(jAPo, j2), AnonymousClass001.A01(jAPo2, j2)) + AXN.A01(c1897AtH.A01.A05, 25.0f));
                }
                C1897AtH c1897AtH6 = textFieldSelectionManager.A03;
                if (c1897AtH6 == null || (interfaceC1497Ak4A015 = c1897AtH6.A01()) == null) {
                    return null;
                }
                return AbstractC1675AoC.A00(aaCA0f, interfaceC1497Ak4A015, interfaceC1497Ak4);
            case 21:
                ((InterfaceC1799ArI) this.A00).cancel();
                return Unit.INSTANCE;
            case 22:
                return ((G0U) this.A00).invoke(Long.valueOf(C3cG.A05(obj) / 1000000));
            case 23:
                return Boolean.valueOf(((C2237BCh) obj).A00.equals(this.A00));
            case 24:
                BCN bcn = (BCN) this.A00;
                BLG<AKC<ApI>> blg = BBH.A0R;
                bcn.AZo(obj);
                return Unit.INSTANCE;
            case 25:
                BBH bbh = (BBH) this.A00;
                Throwable th = (Throwable) obj;
                BLG<AKC<ApI>> blg2 = BBH.A0R;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (bbh.A0K) {
                    HoC hoC = bbh.A06;
                    hm1 = null;
                    if (hoC != null) {
                        AnonymousClass001.A1E(bbh.A0Q, null, BFw.A07);
                        if (bbh.A08) {
                            hm12 = bbh.A05;
                            if (hm12 == null) {
                            }
                            bbh.A05 = null;
                            hoC.AO5(new BT9(14, th, bbh));
                            hm1 = hm12;
                        } else {
                            hoC.A5w(cancellationException);
                        }
                        hm12 = null;
                        bbh.A05 = null;
                        hoC.AO5(new BT9(14, th, bbh));
                        hm1 = hm12;
                    } else {
                        bbh.A03 = cancellationException;
                        AnonymousClass001.A1E(bbh.A0Q, null, BFw.A06);
                    }
                }
                if (hm1 != null) {
                    hm1.resumeWith(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 26:
                return Integer.valueOf(((BBW) this.A00).A00(BCV.A00(((C2229BBz) obj).A01)));
            case 27:
            case 28:
            case 44:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
            default:
                return Boolean.valueOf(((Collection) this.A00).contains(obj));
            case 29:
                G0U g0u = (G0U) this.A00;
                List list = (List) obj;
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                if (list.size() % 2 != 0) {
                    throw C3cG.A0Q("non-zero remainder");
                }
                for (int i = 0; i < list.size(); i += 2) {
                    Object obj2 = list.get(i);
                    C7384Etj.A0Z(obj2, BV3.A00(0));
                    linkedHashMapA0j.put(obj2, list.get(i + 1));
                }
                return g0u.invoke(linkedHashMapA0j);
            case 30:
                AFs aFs = (AFs) this.A00;
                MutableState mutableState3 = (MutableState) obj;
                if (!(mutableState3 instanceof AG4)) {
                    throw C60O.A0i("Failed requirement.");
                }
                AG4 ag4 = (AG4) mutableState3;
                if (ag4.getValue() != 0) {
                    T value3 = ag4.getValue();
                    C7384Etj.A0X(value3);
                    objAbb = aFs.Abb(value3);
                } else {
                    objAbb = null;
                }
                ATF atfAIq = ag4.AIq();
                C7384Etj.A0Z(atfAIq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                return C3cG.A08(atfAIq, objAbb);
            case 31:
                AFx aFx = ((AG9) this.A00).A00;
                zA5t = aFx != null ? aFx.A5t(obj) : true;
                return Boolean.valueOf(zA5t);
            case 32:
                AI7 ai7 = (AI7) obj;
                synchronized (BDh.A08) {
                    j = BDh.A00;
                    BDh.A00 = j + 1;
                }
                return new BDn(ai7, (G0U) this.A00, j);
            case 33:
                G0U g0u2 = (G0U) this.A00;
                C2254BDx<Snapshot> c2254BDx = BDh.A05;
                Snapshot snapshot = (Snapshot) g0u2.invoke(obj);
                synchronized (BDh.A08) {
                    BDh.A01 = BDh.A01.A02(snapshot.A09());
                }
                return snapshot;
            case 34:
                return Boolean.valueOf(((List) obj).retainAll((Collection) this.A00));
            case 35:
                BBO bbo = (BBO) this.A00;
                if (!bbo.A02) {
                    synchronized (bbo.A06) {
                        BBS bbs = bbo.A01;
                        C7384Etj.A0X(bbs);
                        Object obj3 = bbs.A03;
                        C7384Etj.A0X(obj3);
                        int i2 = bbs.A00;
                        AeA<Object> aeA = bbs.A02;
                        if (aeA == null) {
                            aeA = new AeA<>(6);
                            bbs.A02 = aeA;
                            bbs.A06.A0E(obj3, aeA);
                        }
                        BBS.A00(aeA, bbs, obj, obj3, i2);
                    }
                }
                return Unit.INSTANCE;
            case 36:
                B0J b0j = (B0J) obj;
                return FontFamilyResolverImpl.A00((FontFamilyResolverImpl) this.A00, new B0J(null, b0j.A03, b0j.A04, b0j.A00, b0j.A01)).getValue();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                AXN axn = (AXN) this.A00;
                B0G b0g = (B0G) obj;
                StringBuilder sbA0x = C60O.A0x("'");
                sbA0x.append(b0g.ACh());
                sbA0x.append("' ");
                sbA0x.append(b0g.AhA(axn));
                return sbA0x.toString();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                ((BN2) this.A00).Aay(obj);
                return Unit.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return C60O.A0h(((BRL) obj).A00, ((BRL) this.A00).A00);
            case 40:
                ((AMb) this.A00).A04.Af8(obj);
                return Unit.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                ((List) this.A00).get(AnonymousClass001.A0F(obj));
                return null;
            case 42:
                return obj == this.A00 ? "(this Collection)" : String.valueOf(obj);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                Object obj4 = this.A00;
                Map.Entry entry = (Map.Entry) obj;
                C7384Etj.A0Y(entry, 1);
                Object key = entry.getKey();
                String strValueOf = key == obj4 ? "(this Map)" : String.valueOf(key);
                Object value4 = entry.getValue();
                return FGI.A0O(strValueOf, value4 == obj4 ? "(this Map)" : String.valueOf(value4), '=');
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return Long.valueOf(C7Bq.A00(((C0851A5x) ((G0U) this.A00).invoke(obj)).A00));
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) this.A00;
                C9e5 c9e5 = (C9e5) obj;
                C7384Etj.A0Y(c9e5, 1);
                C9iZ c9iZ = C07779iq.A00;
                C0881AGi c0881AGi = C0881AGi.A00;
                C9e5.A00("type", c0881AGi, c9e5, c9iZ, false);
                C9e5.A00(BrowserOperationCatalogKt.VALUE, c0881AGi, c9e5, C9iY.A03(FGI.A0N("kotlinx.serialization.Polymorphic<", C8j3.A12(polymorphicSerializer.A01), '>'), C9hs.A00), false);
                List<? extends Annotation> list2 = polymorphicSerializer.A00;
                C7384Etj.A0Y(list2, 0);
                c9e5.A00 = list2;
                return Unit.INSTANCE;
            case 48:
                C9hq c9hq = (C9hq) this.A00;
                C9e5 c9e52 = (C9e5) obj;
                C7384Etj.A0Y(c9e52, 1);
                C9iZ c9iZ2 = C07779iq.A00;
                C0881AGi c0881AGi2 = C0881AGi.A00;
                C9e5.A00("type", c0881AGi2, c9e52, c9iZ2, false);
                C9e5.A00(BrowserOperationCatalogKt.VALUE, c0881AGi2, c9e52, C9iY.A02(FGI.A0N("kotlinx.serialization.Sealed<", C8j3.A12(c9hq.A04), '>'), A00(c9hq, 49), C9hs.A00), false);
                List<? extends Annotation> list3 = c9hq.A00;
                C7384Etj.A0Y(list3, 0);
                c9e52.A00 = list3;
                return Unit.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                C9hq c9hq2 = (C9hq) this.A00;
                C9e5 c9e53 = (C9e5) obj;
                C7384Etj.A0Y(c9e53, 1);
                Iterator itA0n = AnonymousClass002.A0n(c9hq2.A02);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    C9e5.A00((String) entryA0l.getKey(), C0881AGi.A00, c9e53, ((C9hr) entryA0l.getValue()).getDescriptor(), false);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2297BSx(G0U g0u, G0U<? super Long, ? extends R> g0u2) {
        this.$t = g0u2;
        switch (g0u2) {
            case 22:
            case 32:
                this.A00 = g0u;
                break;
            default:
                this.A00 = g0u;
                break;
        }
    }

    public C2297BSx(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }
}
