package com.facebook.aura.startup.fresco;

import X.AbstractC3422CMk;
import X.BXh;
import X.C7109EgN;
import X.C7110EgO;
import X.C7111EgP;
import X.C7113EgT;
import X.C7114EgU;
import X.C7138Egu;
import X.C7167Ehc;
import X.C7189Ei0;
import X.C7190Ei1;
import X.C7217Eih;
import X.C7218Eii;
import X.C7222Eim;
import X.C7384Etj;
import X.CFL;
import X.Eh4;
import X.EhD;
import X.EhE;
import X.EjK;
import X.EjP;
import X.F0C;
import X.InterfaceC7005EeA;
import X.InterfaceC7145EhB;
import X.InterfaceC7146EhC;
import X.InterfaceC7237Ej1;
import android.content.Context;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.fresco.AuraImageCacheKeyFactory;
import com.facebook.aura.network.fresco.AuraImageNetworkFetcher;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class AuraVitoImageProvider implements EjP {
    public final InterfaceC7145EhB config;
    public final EjK controller;
    public final InterfaceC7237Ej1 imagePipeline;
    public final InterfaceC7146EhC prefetcher;

    public AuraVitoImageProvider(Context context) {
        C7384Etj.A0Y(context, 0);
        Context applicationContext = context.getApplicationContext();
        AuraMemoryTrimmableRegistry auraMemoryTrimmableRegistry = AuraMemoryTrimmableRegistry.INSTANCE;
        C7114EgU c7114EgU = new C7114EgU(new C7113EgT(auraMemoryTrimmableRegistry));
        C7384Etj.A0X(applicationContext);
        final C7167Ehc c7167EhcCreateAuraBitmapMemoryCacheParams = AuraFrescoMemoryKt.createAuraBitmapMemoryCacheParams(applicationContext);
        C7111EgP c7111EgP = new C7111EgP(applicationContext);
        c7111EgP.A07 = new AuraImageNetworkFetcher();
        c7111EgP.A02 = AuraImageCacheKeyFactory.INSTANCE;
        c7111EgP.A05 = AuraSvgDecoder.INSTANCE.createConfig();
        c7111EgP.A03 = BXh.A02;
        c7111EgP.A01 = auraMemoryTrimmableRegistry;
        c7111EgP.A00 = new InterfaceC7005EeA() { // from class: com.facebook.aura.startup.fresco.AuraVitoImageProvider$pipelineConfig$1
            @Override // X.InterfaceC7005EeA
            public final C7167Ehc get() {
                return c7167EhcCreateAuraBitmapMemoryCacheParams;
            }

            @Override // X.InterfaceC7005EeA
            public /* bridge */ /* synthetic */ Object get() {
                return c7167EhcCreateAuraBitmapMemoryCacheParams;
            }
        };
        c7111EgP.A06 = c7114EgU;
        C7110EgO c7110EgO = new C7110EgO(c7111EgP);
        synchronized (C7109EgN.class) {
            if (C7109EgN.A0F != null) {
                CFL cfl = AbstractC3422CMk.A00;
                if (CFL.A02(cfl)) {
                    cfl.Aj7(C7109EgN.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                }
            }
            C7109EgN.A0F = new C7109EgN(c7110EgO);
        }
        C7138Egu c7138Egu = new C7138Egu();
        this.config = c7138Egu;
        C7109EgN c7109EgNA03 = C7109EgN.A03();
        C7190Ei1 c7190Ei1 = new C7190Ei1(new Eh4());
        C7217Eih c7217Eih = new C7217Eih(c7138Egu, c7190Ei1, c7109EgNA03.A06());
        this.imagePipeline = c7217Eih;
        C7222Eim c7222Eim = new C7222Eim(createDefaultDrawableFactory());
        Executor executorA06 = F0C.A06(AuraExecutors.backgroundThreadExecutor$delegate);
        Executor executorA062 = F0C.A06(AuraExecutors.uiThreadExecutor$delegate);
        this.controller = new C7218Eii(c7138Egu, c7217Eih, new EhD(), c7222Eim, new EhE(), executorA06, executorA062);
        this.prefetcher = new C7189Ei0(c7190Ei1, c7109EgNA03.A06());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[PHI: r0
  0x0092: PHI (r0v1 com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl) = 
  (r0v0 com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl)
  (r0v10 com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl)
 binds: [B:3:0x000c, B:12:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.InterfaceC7136Egs createDefaultDrawableFactory() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.fresco.AuraVitoImageProvider.createDefaultDrawableFactory():X.Egs");
    }

    @Override // X.EjP
    public InterfaceC7145EhB getConfig() {
        return this.config;
    }

    @Override // X.EjP
    public EjK getController() {
        return this.controller;
    }

    @Override // X.EjP
    public InterfaceC7237Ej1 getImagePipeline() {
        return this.imagePipeline;
    }

    @Override // X.EjP
    public InterfaceC7146EhC getPrefetcher() {
        return this.prefetcher;
    }
}
