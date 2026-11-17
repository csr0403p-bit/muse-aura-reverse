package com.facebook.aura.model;

import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable(with = LetterBodyPreviewSerializer.class)
/* loaded from: classes4.dex */
public interface LetterBodyPreview {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<LetterBodyPreview> serializer() {
            return LetterBodyPreviewSerializer.INSTANCE;
        }
    }
}
