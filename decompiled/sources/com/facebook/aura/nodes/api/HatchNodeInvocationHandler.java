package com.facebook.aura.nodes.api;

import X.HtJ;
import java.util.Set;

/* loaded from: classes2.dex */
public interface HatchNodeInvocationHandler {

    /* renamed from: com.facebook.aura.nodes.api.HatchNodeInvocationHandler$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static int $default$getMaxArgumentBytes(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 65536;
        }

        public static int $default$getMaxResultBytes(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 1048576;
        }

        public static long $default$getMaxTimeoutMs(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 30000L;
        }

        public static boolean $default$getPreservesArgumentEnvelope(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return false;
        }

        public static boolean $default$getRequiresAuthenticatedReply(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return false;
        }

        public static /* synthetic */ int access$getMaxArgumentBytes$jd(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 65536;
        }

        public static /* synthetic */ int access$getMaxResultBytes$jd(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 1048576;
        }

        public static /* synthetic */ long access$getMaxTimeoutMs$jd(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 30000L;
        }

        public static /* synthetic */ boolean access$getPreservesArgumentEnvelope$jd(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return false;
        }

        public static /* synthetic */ boolean access$getRequiresAuthenticatedReply$jd(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return false;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static int getMaxArgumentBytes(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 65536;
        }

        @Deprecated
        public static int getMaxResultBytes(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 1048576;
        }

        @Deprecated
        public static long getMaxTimeoutMs(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return 30000L;
        }

        @Deprecated
        public static boolean getPreservesArgumentEnvelope(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return false;
        }

        @Deprecated
        public static boolean getRequiresAuthenticatedReply(HatchNodeInvocationHandler hatchNodeInvocationHandler) {
            return false;
        }
    }

    Object execute(HatchNodeInvocation hatchNodeInvocation, HtJ<? super HatchNodeInvocationResult> htJ);

    Set<String> getCommands();

    int getMaxArgumentBytes();

    int getMaxResultBytes();

    long getMaxTimeoutMs();

    boolean getPreservesArgumentEnvelope();

    boolean getRequiresAuthenticatedReply();
}
