package com.facebook.aura.markdown.render;

import X.AGE;
import X.AGI;
import X.AGN;
import X.AHD;
import X.AKH;
import X.AbstractC1699Aoe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BGe;
import X.BO6;
import X.BRg;
import X.C0953AJg;
import X.C14P;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1732ApT;
import X.C1824Aro;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1702Aoh;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkPayload;
import com.facebook.aura.markdown.parser.custom.extensions.ImageGroupPayload;
import com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload;
import com.facebook.aura.markdown.parser.custom.extensions.MathBlockPayload;
import com.facebook.aura.markdown.parser.custom.extensions.MermaidPayload;
import com.facebook.aura.markdown.render.inline.InlineMathEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraMarkdownExtensionRenderersKt {
    public static final AKH<G2j<AuraBlock.CodeBlock, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownCodeBlockRenderer;
    public static final AKH<G2j<FileLinkPayload, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownFileLinkInlineRenderer;
    public static final AKH<G2j<AuraInline.Image, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownImageBlockRenderer;
    public static final AKH<G2j<ImageGroupPayload, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownImageGroupBlockRenderer;
    public static final AKH<BO6<String, AuraMarkdownInlineEntityHandler>> LocalAuraMarkdownInlineEntityHandlers;
    public static final AKH<G2j<AHD<InlineMathEntity>, B6A, BFM, Integer, BO6<String, C14P>>> LocalAuraMarkdownInlineMathContentBuilder;
    public static final AKH<G2j<InlineMathPayload, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownInlineMathRenderer;
    public static final AKH<G2j<MathBlockPayload, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownMathBlockRenderer;
    public static final AKH<G2j<MermaidPayload, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownMermaidBlockRenderer;
    public static final AKH<Boolean> LocalAuraMarkdownShowInternalDebug;
    public static final AKH<G2j<AuraBlock.Table, AuraMarkdownTheme, BFM, Integer, Unit>> LocalAuraMarkdownTableBlockRenderer;

    static {
        Function0 function0 = new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        };
        AGE age = AGE.A00;
        LocalAuraMarkdownMermaidBlockRenderer = new AGN(age, function0);
        LocalAuraMarkdownMathBlockRenderer = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownShowInternalDebug = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass001.A0h();
            }
        });
        LocalAuraMarkdownTableBlockRenderer = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownCodeBlockRenderer = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownImageBlockRenderer = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownImageGroupBlockRenderer = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownInlineMathRenderer = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownInlineMathContentBuilder = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownFileLinkInlineRenderer = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        });
        LocalAuraMarkdownInlineEntityHandlers = new AGN(age, new Function0() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0953AJg.A03;
            }
        });
    }

    public static final G2j LocalAuraMarkdownCodeBlockRenderer$lambda$0() {
        return null;
    }

    public static final G2j LocalAuraMarkdownFileLinkInlineRenderer$lambda$0() {
        return null;
    }

    public static final G2j LocalAuraMarkdownImageBlockRenderer$lambda$0() {
        return null;
    }

    public static final G2j LocalAuraMarkdownImageGroupBlockRenderer$lambda$0() {
        return null;
    }

    public static final G2j LocalAuraMarkdownInlineMathContentBuilder$lambda$0() {
        return null;
    }

    public static final G2j LocalAuraMarkdownInlineMathRenderer$lambda$0() {
        return null;
    }

    public static final G2j LocalAuraMarkdownMathBlockRenderer$lambda$0() {
        return null;
    }

    public static final G2j LocalAuraMarkdownMermaidBlockRenderer$lambda$0() {
        return null;
    }

    public static final boolean LocalAuraMarkdownShowInternalDebug$lambda$0() {
        return false;
    }

    public static final G2j LocalAuraMarkdownTableBlockRenderer$lambda$0() {
        return null;
    }

    public static final AKH<G2j<AuraBlock.CodeBlock, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownCodeBlockRenderer() {
        return LocalAuraMarkdownCodeBlockRenderer;
    }

    public static final AKH<G2j<FileLinkPayload, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownFileLinkInlineRenderer() {
        return LocalAuraMarkdownFileLinkInlineRenderer;
    }

    public static final AKH<G2j<AuraInline.Image, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownImageBlockRenderer() {
        return LocalAuraMarkdownImageBlockRenderer;
    }

    public static final AKH<G2j<ImageGroupPayload, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownImageGroupBlockRenderer() {
        return LocalAuraMarkdownImageGroupBlockRenderer;
    }

    public static final AKH<BO6<String, AuraMarkdownInlineEntityHandler>> getLocalAuraMarkdownInlineEntityHandlers() {
        return LocalAuraMarkdownInlineEntityHandlers;
    }

    public static final AKH<G2j<AHD<InlineMathEntity>, B6A, BFM, Integer, BO6<String, C14P>>> getLocalAuraMarkdownInlineMathContentBuilder() {
        return LocalAuraMarkdownInlineMathContentBuilder;
    }

    public static final AKH<G2j<InlineMathPayload, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownInlineMathRenderer() {
        return LocalAuraMarkdownInlineMathRenderer;
    }

    public static final AKH<G2j<MathBlockPayload, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownMathBlockRenderer() {
        return LocalAuraMarkdownMathBlockRenderer;
    }

    public static final AKH<G2j<MermaidPayload, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownMermaidBlockRenderer() {
        return LocalAuraMarkdownMermaidBlockRenderer;
    }

    public static final AKH<Boolean> getLocalAuraMarkdownShowInternalDebug() {
        return LocalAuraMarkdownShowInternalDebug;
    }

    public static final AKH<G2j<AuraBlock.Table, AuraMarkdownTheme, BFM, Integer, Unit>> getLocalAuraMarkdownTableBlockRenderer() {
        return LocalAuraMarkdownTableBlockRenderer;
    }

    public static final BRg applyAuraMarkdownInlineEntityModifiers(BRg bRg, BO6<String, AuraMarkdownInlineEntityHandler> bo6, AHD<AuraMarkdownInlineEntityRange> ahd) {
        AnonymousClass005.A0x(bRg, bo6, ahd);
        Iterator itA0n = AnonymousClass002.A0n(bo6);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            G0V<BRg, AHD<AuraMarkdownInlineEntityRange>, BRg> g0v = ((AuraMarkdownInlineEntityHandler) entryA0l.getValue()).modifier;
            if (g0v != null) {
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj : ahd) {
                    if (C7384Etj.areEqual(((AuraMarkdownInlineEntityRange) obj).inlineName, key)) {
                        arrayListA0h.add(obj);
                    }
                }
                AHD<AuraMarkdownInlineEntityRange> ahdA07 = AGI.A07(arrayListA0h);
                if (!ahdA07.isEmpty()) {
                    bRg = g0v.invoke(bRg, ahdA07);
                }
            }
        }
        return bRg;
    }

    public static final ApQ withAuraMarkdownInlineEntityLinks(ApQ apQ, BO6<String, AuraMarkdownInlineEntityHandler> bo6, AHD<AuraMarkdownInlineEntityRange> ahd) {
        final G0U<String, Unit> g0u;
        int i;
        int i2;
        AnonymousClass005.A0x(apQ, bo6, ahd);
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler = bo6.get(((AuraMarkdownInlineEntityRange) it.next()).inlineName);
                if (auraMarkdownInlineEntityHandler != null && auraMarkdownInlineEntityHandler.onClick != null) {
                    C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                    c1731ApSA0W.A07(apQ);
                    for (final AuraMarkdownInlineEntityRange auraMarkdownInlineEntityRange : ahd) {
                        AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler2 = bo6.get(auraMarkdownInlineEntityRange.inlineName);
                        if (auraMarkdownInlineEntityHandler2 != null && (g0u = auraMarkdownInlineEntityHandler2.onClick) != null && (i = auraMarkdownInlineEntityRange.start) >= 0 && i < (i2 = auraMarkdownInlineEntityRange.end) && i2 <= c1731ApSA0W.A00.length()) {
                            String str = auraMarkdownInlineEntityRange.key;
                            C1824Aro c1824Aro = auraMarkdownInlineEntityRange.textStyle;
                            C1732ApT.A00(new BGe(new InterfaceC1702Aoh() { // from class: com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt$$ExternalSyntheticLambda0
                                @Override // X.InterfaceC1702Aoh
                                public final void onClick(AbstractC1699Aoe abstractC1699Aoe) {
                                    g0u.invoke(auraMarkdownInlineEntityRange.key);
                                }
                            }, c1824Aro != null ? new C1697Aoc(c1824Aro, null, null, null) : null, str), "", c1731ApSA0W.A01, i, i2);
                        }
                    }
                    return c1731ApSA0W.A04();
                }
            }
        }
        return apQ;
    }
}
