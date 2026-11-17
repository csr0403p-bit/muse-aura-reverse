package com.meta.maps.fancypins;

import android.content.Context;
import android.util.SizeF;

/* loaded from: classes6.dex */
public interface FancyPinErasedPartRegistration {
    boolean apply(FancyPinErasedPartView fancyPinErasedPartView, FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration, FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration2, FancyPinPartState fancyPinPartState, FancyPinPartAnimationHint fancyPinPartAnimationHint, FancyPinPartApplyCompletion fancyPinPartApplyCompletion);

    FancyPinErasedPartView createView(Context context);

    boolean getRequiresApplyContext();

    SizeF measure(FancyPinPartResolveContext fancyPinPartResolveContext, SizeF sizeF);

    FancyPinErasedPartConfiguration prepareForApply(FancyPinErasedPartConfiguration fancyPinErasedPartConfiguration, FancyPinPartApplyContext fancyPinPartApplyContext);

    boolean prepareForReuse(FancyPinErasedPartView fancyPinErasedPartView);

    Object resolve(FancyPinPartResolveContext fancyPinPartResolveContext);

    FancyPinErasedPartConfiguration resolveForApply(FancyPinPartResolveContext fancyPinPartResolveContext);
}
