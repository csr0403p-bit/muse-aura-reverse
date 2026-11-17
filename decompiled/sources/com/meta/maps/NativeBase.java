package com.meta.maps;

import X.AnonymousClass003;
import X.BV5;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class NativeBase {
    public static final Companion Companion = new Companion();
    public static final Logger LOGGER = BV5.A1B(NativeBase.class);
    public static final Set<Reference<?>> REFERENCES;
    public static final ReferenceQueue<NativeBase> REFERENCE_QUEUE;
    public static boolean propagateCleanupException;
    public final long nativeHandle;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanUpQueue() {
            boolean z;
            while (true) {
                Reference<? extends NativeBase> referencePoll = NativeBase.REFERENCE_QUEUE.poll();
                if (referencePoll == null) {
                    return;
                }
                referencePoll.clear();
                try {
                    ((DisposableReference) referencePoll).dispose();
                } finally {
                    if (z) {
                    }
                }
            }
        }

        public Companion() {
        }

        public final void initialize() {
            NativeBase.initialize();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final class DisposableReference extends PhantomReference<NativeBase> {
        public final Disposer disposer;
        public final long nativePointer;

        public final void dispose() {
            NativeBase.REFERENCES.remove(this);
            this.disposer.dispose(this.nativePointer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisposableReference(NativeBase nativeBase, long j, Disposer disposer) {
            super(nativeBase, NativeBase.REFERENCE_QUEUE);
            AnonymousClass003.A0v(nativeBase, disposer);
            this.nativePointer = j;
            this.disposer = disposer;
            NativeBase.Companion.cleanUpQueue();
        }
    }

    public interface Disposer {
        void dispose(long j);
    }

    public NativeBase(long j, Disposer disposer) {
        C7384Etj.A0Y(disposer, 1);
        this.nativeHandle = j;
        REFERENCES.add(new DisposableReference(this, j, disposer));
    }

    public static final native void initialize();

    static {
        Set<Reference<?>> setNewSetFromMap = Collections.newSetFromMap(C60O.A1C());
        C7384Etj.A0U(setNewSetFromMap);
        REFERENCES = setNewSetFromMap;
        REFERENCE_QUEUE = new ReferenceQueue<>();
    }

    public static final void cleanUpQueue() {
        Companion.cleanUpQueue();
    }

    public final long getNativeHandle() {
        return this.nativeHandle;
    }
}
