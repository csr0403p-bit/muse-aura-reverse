package com.facebook.aura.vds.compose.contextmenu;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BGR;
import X.BHJ;
import X.BRg;
import X.C00x;
import X.C0lh;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C1518AkS;
import X.C1DG;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraContextMenuContentKt$AuraContextMenuContent$3 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ G0V<BFM, Integer, AHD<AuraContextMenuItem>> $items;
    public final /* synthetic */ C1DG $maxHeight;
    public final /* synthetic */ AuraContextMenuStyle $menuStyle;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;
    public final /* synthetic */ C1110AYw $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraContextMenuContentKt$AuraContextMenuContent$3(BRg bRg, C1DG c1dg, C1110AYw c1110AYw, G0V<? super BFM, ? super Integer, ? extends AHD<AuraContextMenuItem>> g0v, AuraContextMenuStyle auraContextMenuStyle, C1518AkS c1518AkS, G0U<? super AuraContextMenuItem, Unit> g0u) {
        super(3);
        this.$modifier = bRg;
        this.$maxHeight = c1dg;
        this.$scrollState = c1110AYw;
        this.$items = g0v;
        this.$menuStyle = auraContextMenuStyle;
        this.$focusRequester = c1518AkS;
        this.$onItemClick = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        float f;
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            BRg bRg = this.$modifier;
            C1DG c1dg = this.$maxHeight;
            if (c1dg != null) {
                f = c1dg.A00;
            } else {
                f = Float.NaN;
            }
            int i2 = 0;
            BRg bRgA02 = AbstractC1103AYp.A02(this.$scrollState, BGR.A01(C0lh.A02, C3U4.A09(C10G.A0A(bRg, Float.NaN, f), 10.0f)), true);
            G0V<BFM, Integer, AHD<AuraContextMenuItem>> g0v = this.$items;
            AuraContextMenuStyle auraContextMenuStyle = this.$menuStyle;
            C1518AkS c1518AkS = this.$focusRequester;
            G0U<AuraContextMenuItem, Unit> g0u = this.$onItemClick;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                AHD<AuraContextMenuItem> ahdInvoke = g0v.invoke(bfm, 0);
                Iterator it = ahdInvoke.iterator();
                int i3 = 0;
                while (true) {
                    if (it.hasNext()) {
                        AuraContextMenuItem auraContextMenuItem = (AuraContextMenuItem) it.next();
                        if (!auraContextMenuItem.isDivider && !auraContextMenuItem.isStaticText) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahdInvoke, -2007312433);
                int i4 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    i2++;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        AuraContextMenuItem auraContextMenuItem2 = (AuraContextMenuItem) next;
                        if (auraContextMenuItem2.isDivider) {
                            bfm.AgE(17368270);
                            AuraDividerKt.AuraDivider(C3U4.A06(BRg.A00, 4.0f), AuraDividerStyle.Secondary.INSTANCE, false, bfm, 54, 4);
                        } else if (auraContextMenuItem2.isStaticText) {
                            bfm.AgE(17569429);
                            AuraContextMenuItemContentKt.AuraContextMenuStaticTextContent(auraContextMenuItem2.label, auraContextMenuStyle, auraContextMenuItem2.modifier, auraContextMenuItem2.labelMaxLines, bfm, 0, 0);
                        } else {
                            bfm.AgE(17829178);
                            String str = auraContextMenuItem2.label;
                            String str2 = auraContextMenuItem2.description;
                            int i5 = auraContextMenuItem2.descriptionMaxLines;
                            int i6 = auraContextMenuItem2.labelMaxLines;
                            AVy aVy = auraContextMenuItem2.startIconPainter;
                            B6A b6a = auraContextMenuItem2.startIconTint;
                            AVy aVy2 = auraContextMenuItem2.trailingIconPainter;
                            boolean z = auraContextMenuItem2.isEnabled;
                            boolean z2 = auraContextMenuItem2.isSelected;
                            boolean z3 = auraContextMenuItem2.isDestructive;
                            BRg bRg2 = auraContextMenuItem2.modifier;
                            BRg bRgA00 = BRg.A00;
                            if (i4 == i3) {
                                bRgA00 = BHJ.A00(bRgA00, c1518AkS);
                            }
                            BRg bRgThen = bRg2.then(bRgA00);
                            boolean zA1K = AnonymousClass003.A1K(bfm, g0u, auraContextMenuItem2);
                            Object objAaT = bfm.AaT();
                            if (zA1K || objAaT == C78N.A00) {
                                objAaT = new AuraContextMenuContentKt$AuraContextMenuContent$3$1$1$1$1(g0u, auraContextMenuItem2);
                                bfm.Ai0(objAaT);
                            }
                            int i7 = AVy.$stable;
                            AuraContextMenuItemContentKt.m2516AuraContextMenuItemContentyQUhCh4(str, auraContextMenuStyle, bRgThen, str2, i5, i6, aVy, b6a, aVy2, (Function0) objAaT, z2, z, z3, bfm, (i7 << 18) | (i7 << 24), 0, 0);
                        }
                        BBI.A0R(bbi, false);
                        i4 = i2;
                    }
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                return;
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
    }
}
