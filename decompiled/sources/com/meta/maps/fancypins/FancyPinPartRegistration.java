package com.meta.maps.fancypins;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV5;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.content.Context;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.View;
import com.meta.maps.fancypins.FancyPinPartConfiguration;
import com.meta.maps.fancypins.FancyPinPartView;

/* loaded from: classes6.dex */
public final class FancyPinPartRegistration<Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> {
    public static final Companion Companion = new Companion();
    public final FancyPinPartRegistration$erasedRegistration$1 erasedRegistration;
    public final G0V<FancyPinPartResolveContext, SizeF, SizeF> measurementHandler;
    public final G0V<Configuration, FancyPinPartApplyContext, Configuration> prepareForApplyHandler;
    public final G0U<FancyPinPartResolveContext, Configuration> resolver;
    public final G0U<Context, PartView> viewFactory;

    public final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FancyPinPartRegistration autoSized$default(Companion companion, G0U g0u, G0U g0u2, G0V g0v, G0V g0v2, int i, Object obj) {
            if ((i & 4) != 0) {
                g0v = null;
            }
            return companion.autoSized(g0u, g0u2, g0v, g0v2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FancyPinPartRegistration fixed$default(Companion companion, G0U g0u, G0U g0u2, G0V g0v, int i, Object obj) {
            if ((i & 4) != 0) {
                g0v = null;
            }
            return companion.fixed(g0u, g0u2, g0v);
        }

        public Companion() {
        }

        public final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> autoSized(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2, G0V<? super Configuration, ? super FancyPinPartApplyContext, ? extends Configuration> g0v, G0V<? super Configuration, ? super SizeF, SizeF> g0v2) {
            AnonymousClass005.A0y(g0u, g0u2, g0v2);
            return new FancyPinPartRegistration<>(g0u, g0u2, new FancyPinPartRegistration$Companion$autoSized$1(g0v2, g0u2), g0v);
        }

        public final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> fixed(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2) {
            AnonymousClass003.A0u(g0u, g0u2);
            return new FancyPinPartRegistration<>(g0u, g0u2, null, null);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> autoSized(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2, G0V<? super Configuration, ? super SizeF, SizeF> g0v) {
            AnonymousClass005.A0x(g0u, g0u2, g0v);
            return autoSized(g0u, g0u2, null, g0v);
        }

        public final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> fixed(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2, G0V<? super Configuration, ? super FancyPinPartApplyContext, ? extends Configuration> g0v) {
            AnonymousClass003.A0u(g0u, g0u2);
            return new FancyPinPartRegistration<>(g0u, g0u2, null, g0v);
        }
    }

    public final void apply(PartView partview, Configuration configuration, Configuration configuration2, FancyPinPartState fancyPinPartState, FancyPinPartAnimationHint fancyPinPartAnimationHint) {
        AnonymousClass005.A0y(partview, configuration, fancyPinPartState);
        C7384Etj.A0Y(fancyPinPartAnimationHint, 4);
        apply(partview, configuration, configuration2, fancyPinPartState, fancyPinPartAnimationHint, null);
    }

    public final PartView createView(Context context) {
        C7384Etj.A0Y(context, 0);
        checkMainThread("createView");
        return this.viewFactory.invoke(context);
    }

    public final Configuration resolve(FancyPinPartResolveContext fancyPinPartResolveContext) {
        C7384Etj.A0Y(fancyPinPartResolveContext, 0);
        return this.resolver.invoke(fancyPinPartResolveContext);
    }

    public static /* synthetic */ void apply$default(FancyPinPartRegistration fancyPinPartRegistration, View view, FancyPinPartConfiguration fancyPinPartConfiguration, FancyPinPartConfiguration fancyPinPartConfiguration2, FancyPinPartState fancyPinPartState, FancyPinPartAnimationHint fancyPinPartAnimationHint, FancyPinPartApplyCompletion fancyPinPartApplyCompletion, int i, Object obj) {
        if ((i & 32) != 0) {
            fancyPinPartApplyCompletion = null;
        }
        fancyPinPartRegistration.apply(view, fancyPinPartConfiguration, fancyPinPartConfiguration2, fancyPinPartState, fancyPinPartAnimationHint, fancyPinPartApplyCompletion);
    }

    public static final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> autoSized(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2, G0V<? super Configuration, ? super FancyPinPartApplyContext, ? extends Configuration> g0v, G0V<? super Configuration, ? super SizeF, SizeF> g0v2) {
        return Companion.autoSized(g0u, g0u2, g0v, g0v2);
    }

    public static final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> fixed(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2) {
        return Companion.fixed(g0u, g0u2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Configuration ownedConfiguration(FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration) {
        OwnedPartConfiguration ownedPartConfiguration;
        Configuration configuration;
        if (!(fancyPinErasedPartConfiguration instanceof OwnedPartConfiguration) || (ownedPartConfiguration = (OwnedPartConfiguration) fancyPinErasedPartConfiguration) == null || ownedPartConfiguration.owner != this || (configuration = (Configuration) ownedPartConfiguration.value) == null) {
            return null;
        }
        return configuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PartView ownedView(FancyPinErasedPartView fancyPinErasedPartView) {
        OwnedPartView ownedPartView;
        PartView partview;
        if (!(fancyPinErasedPartView instanceof OwnedPartView) || (ownedPartView = (OwnedPartView) fancyPinErasedPartView) == null || ownedPartView.owner != this || (partview = (PartView) ownedPartView.getView()) == null) {
            return null;
        }
        return partview;
    }

    public final FancyPinErasedPartRegistration erased$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.erasedRegistration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.meta.maps.fancypins.FancyPinPartRegistration$erasedRegistration$1] */
    public FancyPinPartRegistration(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2, G0V<? super FancyPinPartResolveContext, ? super SizeF, SizeF> g0v, G0V<? super Configuration, ? super FancyPinPartApplyContext, ? extends Configuration> g0v2) {
        this.viewFactory = g0u;
        this.resolver = g0u2;
        this.measurementHandler = g0v;
        this.prepareForApplyHandler = g0v2;
        this.erasedRegistration = new FancyPinErasedPartRegistration(this) { // from class: com.meta.maps.fancypins.FancyPinPartRegistration$erasedRegistration$1
            public final boolean requiresApplyContext;
            public final /* synthetic */ FancyPinPartRegistration<Configuration, PartView> this$0;

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public boolean apply(FancyPinErasedPartView fancyPinErasedPartView, FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration, FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration2, FancyPinPartState fancyPinPartState, FancyPinPartAnimationHint fancyPinPartAnimationHint, FancyPinPartApplyCompletion fancyPinPartApplyCompletion) {
                C7384Etj.A0Y(fancyPinErasedPartView, 0);
                AnonymousClass005.A12(fancyPinErasedPartConfiguration, fancyPinPartState, fancyPinPartAnimationHint, 1);
                this.this$0.checkMainThread("apply");
                FancyPinPartRegistration<Configuration, PartView> fancyPinPartRegistration = this.this$0;
                View viewOwnedView = fancyPinPartRegistration.ownedView(fancyPinErasedPartView);
                FancyPinPartConfiguration fancyPinPartConfigurationOwnedConfiguration = fancyPinPartRegistration.ownedConfiguration(fancyPinErasedPartConfiguration);
                if (viewOwnedView != null && fancyPinPartConfigurationOwnedConfiguration != null) {
                    fancyPinPartRegistration.apply(viewOwnedView, fancyPinPartConfigurationOwnedConfiguration, fancyPinErasedPartConfiguration2 != null ? fancyPinPartRegistration.ownedConfiguration(fancyPinErasedPartConfiguration2) : null, fancyPinPartState, fancyPinPartAnimationHint, fancyPinPartApplyCompletion);
                    return true;
                }
                if (fancyPinPartApplyCompletion != null) {
                    fancyPinPartApplyCompletion.onComplete();
                }
                return false;
            }

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public FancyPinErasedPartView createView(Context context) {
                C7384Etj.A0Y(context, 0);
                FancyPinPartRegistration<Configuration, PartView> fancyPinPartRegistration = this.this$0;
                return new OwnedPartView(fancyPinPartRegistration, fancyPinPartRegistration.createView(context));
            }

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public boolean prepareForReuse(FancyPinErasedPartView fancyPinErasedPartView) {
                C7384Etj.A0Y(fancyPinErasedPartView, 0);
                this.this$0.checkMainThread("prepareForReuse");
                KeyEvent.Callback callbackOwnedView = this.this$0.ownedView(fancyPinErasedPartView);
                if (callbackOwnedView == null) {
                    return false;
                }
                ((FancyPinPartView) callbackOwnedView).prepareForReuse();
                return true;
            }

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public Object resolve(FancyPinPartResolveContext fancyPinPartResolveContext) {
                C7384Etj.A0Y(fancyPinPartResolveContext, 0);
                return this.this$0.resolve(fancyPinPartResolveContext);
            }

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public FancyPinErasedPartConfiguration resolveForApply(FancyPinPartResolveContext fancyPinPartResolveContext) {
                C7384Etj.A0Y(fancyPinPartResolveContext, 0);
                FancyPinPartRegistration<Configuration, PartView> fancyPinPartRegistration = this.this$0;
                return new OwnedPartConfiguration(fancyPinPartRegistration, fancyPinPartRegistration.resolve(fancyPinPartResolveContext));
            }

            {
                this.this$0 = this;
                this.requiresApplyContext = AnonymousClass002.A1X(this.prepareForApplyHandler);
            }

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public boolean getRequiresApplyContext() {
                return this.requiresApplyContext;
            }

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public SizeF measure(FancyPinPartResolveContext fancyPinPartResolveContext, SizeF sizeF) {
                AnonymousClass003.A0u(fancyPinPartResolveContext, sizeF);
                return this.this$0.measure$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinPartResolveContext, sizeF);
            }

            @Override // com.meta.maps.fancypins.FancyPinErasedPartRegistration
            public FancyPinErasedPartConfiguration prepareForApply(FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration, FancyPinPartApplyContext fancyPinPartApplyContext) {
                AnonymousClass003.A0u(fancyPinErasedPartConfiguration, fancyPinPartApplyContext);
                this.this$0.checkMainThread("prepareForApply");
                FancyPinPartRegistration<Configuration, PartView> fancyPinPartRegistration = this.this$0;
                FancyPinPartConfiguration fancyPinPartConfigurationOwnedConfiguration = fancyPinPartRegistration.ownedConfiguration(fancyPinErasedPartConfiguration);
                if (fancyPinPartConfigurationOwnedConfiguration == null) {
                    return null;
                }
                G0V<Configuration, FancyPinPartApplyContext, Configuration> g0v3 = fancyPinPartRegistration.prepareForApplyHandler;
                return g0v3 != 0 ? new OwnedPartConfiguration(fancyPinPartRegistration, (FancyPinPartConfiguration) g0v3.invoke(fancyPinPartConfigurationOwnedConfiguration, fancyPinPartApplyContext)) : fancyPinErasedPartConfiguration;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkMainThread(String str) {
        if (!C3cH.A1K()) {
            throw BV5.A0V("FancyPinPartRegistration.", str, " must run on the main thread");
        }
    }

    public final SizeF measure$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinPartResolveContext fancyPinPartResolveContext, SizeF sizeF) {
        AnonymousClass003.A0u(fancyPinPartResolveContext, sizeF);
        G0V<FancyPinPartResolveContext, SizeF, SizeF> g0v = this.measurementHandler;
        if (g0v != null) {
            return g0v.invoke(fancyPinPartResolveContext, sizeF);
        }
        return null;
    }

    public final Configuration prepareForApply(Configuration configuration, FancyPinPartApplyContext fancyPinPartApplyContext) {
        Configuration configurationInvoke;
        AnonymousClass003.A0u(configuration, fancyPinPartApplyContext);
        checkMainThread("prepareForApply");
        G0V<Configuration, FancyPinPartApplyContext, Configuration> g0v = this.prepareForApplyHandler;
        return (g0v == null || (configurationInvoke = g0v.invoke(configuration, fancyPinPartApplyContext)) == null) ? configuration : configurationInvoke;
    }

    public /* synthetic */ FancyPinPartRegistration(G0U g0u, G0U g0u2, G0V g0v, G0V g0v2, C06H c06h) {
        this(g0u, g0u2, g0v, g0v2);
    }

    public static final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> autoSized(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2, G0V<? super Configuration, ? super SizeF, SizeF> g0v) {
        return Companion.autoSized(g0u, g0u2, g0v);
    }

    public static final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> FancyPinPartRegistration<Configuration, PartView> fixed(G0U<? super Context, ? extends PartView> g0u, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u2, G0V<? super Configuration, ? super FancyPinPartApplyContext, ? extends Configuration> g0v) {
        return Companion.fixed(g0u, g0u2, g0v);
    }

    public final void apply(PartView partview, Configuration configuration, Configuration configuration2, FancyPinPartState fancyPinPartState, FancyPinPartAnimationHint fancyPinPartAnimationHint, FancyPinPartApplyCompletion fancyPinPartApplyCompletion) {
        AnonymousClass005.A0y(partview, configuration, fancyPinPartState);
        C7384Etj.A0Y(fancyPinPartAnimationHint, 4);
        checkMainThread("apply");
        ((FancyPinPartView) partview).apply(configuration, configuration2, fancyPinPartState, fancyPinPartAnimationHint, fancyPinPartApplyCompletion);
    }
}
