package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class BUR extends AbstractC7559F3s implements G0V {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUR(int i) {
        super(2);
        this.$t = i;
    }

    public static BUR A00(int i) {
        return new BUR(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v54, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, X.9jH] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, X.AOr] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, X.ASj] */
    /* JADX WARN: Type inference failed for: r6v24, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.util.Collection] */
    @Override // X.G0V
    public final /* bridge */ /* synthetic */ T invoke(T t, T t2) {
        switch (this.$t) {
            case 0:
                return C1003AOr.A00(BL4.A00(C8j3.A0N()));
            case 1:
                return AnonymousClass002.A0J(AbstractC0996ANj.A00, 500);
            case 2:
                String str = (String) t;
                return str.length() == 0 ? t2.toString() : AnonymousClass006.A0y(t2, ", ", C3cG.A0g(str));
            case 3:
            case 9:
            case 40:
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                int iA0F = AnonymousClass001.A0F(t2);
                AnonymousClass007.A1D(AnonymousClass004.A1E(iA0F), (BFM) t, iA0F);
                break;
            case 4:
                ((AZp) t2).A00 = C2328BUc.A00(t, 14);
                break;
            case 5:
                AnonymousClass005.A0w(t2);
                break;
            case 6:
                ((InterfaceC1516AkQ) t).Adi((InterfaceC1380AiA) t2);
                break;
            case 7:
                ((InterfaceC1516AkQ) t).Adn((BRg) t2);
                break;
            case 8:
                InterfaceC1492Ajz interfaceC1492Ajz = (InterfaceC1492Ajz) t2;
                C1453AjM c1453AjM = (C1453AjM) ((InterfaceC1516AkQ) t);
                c1453AjM.A04 = interfaceC1492Ajz;
                C0967AJu c0967AJu = (C0967AJu) interfaceC1492Ajz;
                c1453AjM.A0Z((AXN) AKO.A08(Am0.A04, c0967AJu));
                EnumC1820Arj enumC1820Arj = (EnumC1820Arj) AKO.A08(Am0.A0A, c0967AJu);
                if (c1453AjM.A0G != enumC1820Arj) {
                    c1453AjM.A0G = enumC1820Arj;
                    c1453AjM.A0K();
                    C1453AjM c1453AjMA0E = c1453AjM.A0E();
                    if (c1453AjMA0E != null) {
                        c1453AjMA0E.A0I();
                    } else {
                        Object obj = c1453AjM.A0D;
                        if (obj != null) {
                            ((View) obj).invalidate();
                        }
                    }
                    c1453AjM.A0J();
                    for (AbstractC1439Aj8 abstractC1439Aj8 = c1453AjM.A0f.A02; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
                        abstractC1439Aj8.onLayoutDirectionChange();
                    }
                }
                c1453AjM.A0Y((InterfaceC1079AXi) AKO.A08(Am0.A0H, c0967AJu));
                AbstractC1439Aj8 abstractC1439Aj82 = c1453AjM.A0f.A02;
                if ((abstractC1439Aj82.aggregateChildKindSet & 32768) != 0) {
                    do {
                        if ((abstractC1439Aj82.kindSet & 32768) != 0) {
                            C0910AHm c0910AHmA0K = null;
                            AbstractC1439Aj8 abstractC1439Aj8A0X = abstractC1439Aj82;
                            do {
                                if (abstractC1439Aj8A0X instanceof C1Z2) {
                                    AbstractC1439Aj8 abstractC1439Aj83 = abstractC1439Aj8A0X.node;
                                    if (abstractC1439Aj83.isAttached) {
                                        AbstractC1436Aj5.A04(abstractC1439Aj83);
                                    } else {
                                        abstractC1439Aj83.updatedNodeAwaitingAttachForInvalidation = true;
                                    }
                                } else if ((abstractC1439Aj8A0X.kindSet & 32768) != 0 && (abstractC1439Aj8A0X instanceof AbstractC1437Aj6)) {
                                    int i = 0;
                                    for (AbstractC1439Aj8 abstractC1439Aj84 = ((AbstractC1437Aj6) abstractC1439Aj8A0X).A00; abstractC1439Aj84 != null; abstractC1439Aj84 = abstractC1439Aj84.child) {
                                        if ((abstractC1439Aj84.kindSet & 32768) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC1439Aj8A0X = abstractC1439Aj84;
                                            } else {
                                                c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                                abstractC1439Aj8A0X = C8j4.A0X(c0910AHmA0K, abstractC1439Aj8A0X);
                                                c0910AHmA0K.A0G(abstractC1439Aj84);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC1439Aj8A0X = AbstractC1414Aij.A00(c0910AHmA0K);
                            } while (abstractC1439Aj8A0X != null);
                        }
                        if ((abstractC1439Aj82.aggregateChildKindSet & 32768) == 0) {
                            break;
                        } else {
                            abstractC1439Aj82 = abstractC1439Aj82.child;
                        }
                    } while (abstractC1439Aj82 != null);
                }
                break;
            case 10:
                Collection collection = (Collection) t;
                Iterable iterable = (Iterable) t2;
                if (collection == null) {
                    collection = C0881AGi.A00;
                }
                return AbstractC0878AGe.A0P(iterable, collection);
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
                return t;
            case 12:
            case 24:
                Collection collection2 = (Collection) t;
                ?? r7 = (Collection) t2;
                if (collection2 == null) {
                    return r7;
                }
                ?? arrayList = new ArrayList(collection2);
                arrayList.addAll(r7);
                return arrayList;
            case 17:
                throw C3cG.A0Q("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 18:
                throw C3cG.A0Q("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 20:
                throw C3cG.A0Q("merge function called on unmergeable property PaneTitle.");
            case 25:
                ((Number) t2).floatValue();
                return t;
            case 28:
                return t != 0 ? t : t2;
            case 29:
                C1562Alc c1562Alc = (C1562Alc) t2;
                C0919AHv c0919AHv = ((C1562Alc) t).A04;
                C0920AHw<Float> c0920AHw = AbstractC1671Anw.A0h;
                Object objA05 = c0919AHv.A03.A05(c0920AHw);
                if (objA05 == null) {
                    objA05 = AnonymousClass005.A0a();
                }
                float fA02 = AnonymousClass001.A02(objA05);
                Object objA052 = c1562Alc.A04.A03.A05(c0920AHw);
                if (objA052 == null) {
                    objA052 = AnonymousClass005.A0a();
                }
                return Integer.valueOf(Float.compare(fA02, AnonymousClass001.A02(objA052)));
            case 30:
                AbstractC1532Ako.A00((C1453AjM) t).setResetBlock((G0U) t2);
                break;
            case 31:
            case 33:
                AbstractC1532Ako.A00((C1453AjM) t).setUpdateBlock((G0U) t2);
                break;
            case 32:
            case 34:
                AbstractC1532Ako.A00((C1453AjM) t).setReleaseBlock((G0U) t2);
                break;
            case 35:
                AbstractC1532Ako.A00((C1453AjM) t).setModifier((BRg) t2);
                break;
            case 36:
                AbstractC1532Ako.A00((C1453AjM) t).setDensity((AXN) t2);
                break;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                AbstractC1532Ako.A00((C1453AjM) t).setLifecycleOwner((C1HY) t2);
                break;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                AbstractC1532Ako.A00((C1453AjM) t).setSavedStateRegistryOwner((A6I) t2);
                break;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                C1534Akq c1534AkqA00 = AbstractC1532Ako.A00((C1453AjM) t);
                int iOrdinal = ((EnumC1820Arj) t2).ordinal();
                int i2 = 1;
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                c1534AkqA00.setLayoutDirection(i2);
                break;
            case 42:
                return C9jH.A00;
            default:
                return null;
        }
        return Unit.INSTANCE;
    }
}
