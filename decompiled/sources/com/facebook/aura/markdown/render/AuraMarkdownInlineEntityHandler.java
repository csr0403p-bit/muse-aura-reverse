package com.facebook.aura.markdown.render;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C06H;
import X.C0KA;
import X.C14P;
import X.C1824Aro;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C8j5;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraMarkdownInlineEntityHandler {
    public static final int $stable = 0;
    public final boolean addDottedUnderline;
    public final G0W<AHD<AuraMarkdownInlineEntitySlot>, BFM, Integer, BO6<String, C14P>> leadingContent;
    public final G0V<BRg, AHD<AuraMarkdownInlineEntityRange>, BRg> modifier;
    public final G0U<String, Unit> onClick;
    public final G0U<String, Unit> onLongPress;
    public final G0U<AuraInline.Custom, AuraMarkdownInlineEntity> resolver;
    public final boolean tableClicksEnabled;
    public final G0U<AuraMarkdownTheme, C1824Aro> textStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public AuraMarkdownInlineEntityHandler(G0U<? super AuraInline.Custom, AuraMarkdownInlineEntity> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0W<? super AHD<AuraMarkdownInlineEntitySlot>, ? super BFM, ? super Integer, ? extends BO6<String, C14P>> g0w, G0V<? super BRg, ? super AHD<AuraMarkdownInlineEntityRange>, ? extends BRg> g0v, G0U<? super AuraMarkdownTheme, C1824Aro> g0u4, boolean z, boolean z2) {
        C7384Etj.A0Y(g0u, 0);
        this.resolver = g0u;
        this.onClick = g0u2;
        this.onLongPress = g0u3;
        this.leadingContent = g0w;
        this.modifier = g0v;
        this.textStyle = g0u4;
        this.addDottedUnderline = z;
        this.tableClicksEnabled = z2;
    }

    public final AuraMarkdownInlineEntityHandler copy(G0U<? super AuraInline.Custom, AuraMarkdownInlineEntity> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0W<? super AHD<AuraMarkdownInlineEntitySlot>, ? super BFM, ? super Integer, ? extends BO6<String, C14P>> g0w, G0V<? super BRg, ? super AHD<AuraMarkdownInlineEntityRange>, ? extends BRg> g0v, G0U<? super AuraMarkdownTheme, C1824Aro> g0u4, boolean z, boolean z2) {
        C7384Etj.A0Y(g0u, 0);
        return new AuraMarkdownInlineEntityHandler(g0u, g0u2, g0u3, g0w, g0v, g0u4, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraMarkdownInlineEntityHandler) {
                AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler = (AuraMarkdownInlineEntityHandler) obj;
                if (!C7384Etj.areEqual(this.resolver, auraMarkdownInlineEntityHandler.resolver) || !C7384Etj.areEqual(this.onClick, auraMarkdownInlineEntityHandler.onClick) || !C7384Etj.areEqual(this.onLongPress, auraMarkdownInlineEntityHandler.onLongPress) || !C7384Etj.areEqual(this.leadingContent, auraMarkdownInlineEntityHandler.leadingContent) || !C7384Etj.areEqual(this.modifier, auraMarkdownInlineEntityHandler.modifier) || !C7384Etj.areEqual(this.textStyle, auraMarkdownInlineEntityHandler.textStyle) || this.addDottedUnderline != auraMarkdownInlineEntityHandler.addDottedUnderline || this.tableClicksEnabled != auraMarkdownInlineEntityHandler.tableClicksEnabled) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuraMarkdownInlineEntityHandler copy$default(AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler, G0U g0u, G0U g0u2, G0U g0u3, G0W g0w, G0V g0v, G0U g0u4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            g0u = auraMarkdownInlineEntityHandler.resolver;
        }
        if ((i & 2) != 0) {
            g0u2 = auraMarkdownInlineEntityHandler.onClick;
        }
        if ((i & 4) != 0) {
            g0u3 = auraMarkdownInlineEntityHandler.onLongPress;
        }
        if ((i & 8) != 0) {
            g0w = auraMarkdownInlineEntityHandler.leadingContent;
        }
        if ((i & 16) != 0) {
            g0v = auraMarkdownInlineEntityHandler.modifier;
        }
        if ((i & 32) != 0) {
            g0u4 = auraMarkdownInlineEntityHandler.textStyle;
        }
        if ((i & 64) != 0) {
            z = auraMarkdownInlineEntityHandler.addDottedUnderline;
        }
        if ((i & 128) != 0) {
            z2 = auraMarkdownInlineEntityHandler.tableClicksEnabled;
        }
        return auraMarkdownInlineEntityHandler.copy(g0u, g0u2, g0u3, g0w, g0v, g0u4, z, z2);
    }

    public final G0U<AuraInline.Custom, AuraMarkdownInlineEntity> component1() {
        return this.resolver;
    }

    public final G0U<String, Unit> component2() {
        return this.onClick;
    }

    public final G0U<String, Unit> component3() {
        return this.onLongPress;
    }

    public final G0W<AHD<AuraMarkdownInlineEntitySlot>, BFM, Integer, BO6<String, C14P>> component4() {
        return this.leadingContent;
    }

    public final G0V<BRg, AHD<AuraMarkdownInlineEntityRange>, BRg> component5() {
        return this.modifier;
    }

    public final G0U<AuraMarkdownTheme, C1824Aro> component6() {
        return this.textStyle;
    }

    public final boolean component7() {
        return this.addDottedUnderline;
    }

    public final boolean component8() {
        return this.tableClicksEnabled;
    }

    public final boolean getAddDottedUnderline() {
        return this.addDottedUnderline;
    }

    public final G0W<AHD<AuraMarkdownInlineEntitySlot>, BFM, Integer, BO6<String, C14P>> getLeadingContent() {
        return this.leadingContent;
    }

    public final G0V<BRg, AHD<AuraMarkdownInlineEntityRange>, BRg> getModifier() {
        return this.modifier;
    }

    public final G0U<String, Unit> getOnClick() {
        return this.onClick;
    }

    public final G0U<String, Unit> getOnLongPress() {
        return this.onLongPress;
    }

    public final G0U<AuraInline.Custom, AuraMarkdownInlineEntity> getResolver() {
        return this.resolver;
    }

    public final boolean getTableClicksEnabled() {
        return this.tableClicksEnabled;
    }

    public final G0U<AuraMarkdownTheme, C1824Aro> getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((((((((((AnonymousClass005.A0E(this.resolver) + AnonymousClass006.A0D(this.onClick)) * 31) + AnonymousClass006.A0D(this.onLongPress)) * 31) + AnonymousClass006.A0D(this.leadingContent)) * 31) + AnonymousClass006.A0D(this.modifier)) * 31) + C3cH.A02(this.textStyle)) * 31, this.addDottedUnderline), this.tableClicksEnabled);
    }

    public String toString() {
        G0U<AuraInline.Custom, AuraMarkdownInlineEntity> g0u = this.resolver;
        G0U<String, Unit> g0u2 = this.onClick;
        G0U<String, Unit> g0u3 = this.onLongPress;
        G0W<AHD<AuraMarkdownInlineEntitySlot>, BFM, Integer, BO6<String, C14P>> g0w = this.leadingContent;
        G0V<BRg, AHD<AuraMarkdownInlineEntityRange>, BRg> g0v = this.modifier;
        G0U<AuraMarkdownTheme, C1824Aro> g0u4 = this.textStyle;
        boolean z = this.addDottedUnderline;
        boolean z2 = this.tableClicksEnabled;
        StringBuilder sbA0f = C3cG.A0f(g0u, "AuraMarkdownInlineEntityHandler(resolver=");
        sbA0f.append(", onClick=");
        sbA0f.append(g0u2);
        sbA0f.append(", onLongPress=");
        sbA0f.append(g0u3);
        sbA0f.append(", leadingContent=");
        sbA0f.append(g0w);
        sbA0f.append(", modifier=");
        sbA0f.append(g0v);
        sbA0f.append(", textStyle=");
        sbA0f.append(g0u4);
        sbA0f.append(", addDottedUnderline=");
        sbA0f.append(z);
        return C8j5.A0W(", tableClicksEnabled=", sbA0f, z2);
    }

    public /* synthetic */ AuraMarkdownInlineEntityHandler(G0U g0u, G0U g0u2, G0U g0u3, G0W g0w, G0V g0v, G0U g0u4, boolean z, boolean z2, int i, C06H c06h) {
        this(g0u, (i & 2) != 0 ? null : g0u2, (i & 4) != 0 ? null : g0u3, (i & 8) != 0 ? null : g0w, (i & 16) != 0 ? null : g0v, (i & 32) != 0 ? null : g0u4, (i & 64) != 0 ? false : z, C3cH.A1N(i, z2));
    }
}
