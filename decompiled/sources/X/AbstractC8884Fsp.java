package X;

import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import com.facebook.aura.settings.HatchWhatsAppUiState;
import com.facebook.aura.settings.WhatsAppReplacePhase;
import com.facebook.aura.uicontrol.UiControlDispatcher;
import com.hatch.browser.core.FfiConverterString;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiRustCallStatus;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* renamed from: X.Fsp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8884Fsp implements HtJ<Object>, GAu, Serializable {
    public final HtJ<Object> completion;

    public static void A0R(DataSourcePublishPipeline.C127691 c127691, Object obj, Object obj2) {
        c127691.L$0 = null;
        c127691.L$1 = obj;
        c127691.L$2 = null;
        c127691.L$3 = null;
        c127691.L$4 = null;
        c127691.L$5 = null;
        c127691.L$6 = null;
        c127691.L$7 = null;
        c127691.L$8 = obj2;
    }

    public static void A0S(UiControlDispatcher.C142581 c142581) {
        c142581.L$0 = null;
        c142581.L$1 = null;
        c142581.L$2 = null;
        c142581.L$3 = null;
        c142581.L$4 = null;
        c142581.L$5 = null;
    }

    public abstract Object invokeSuspend(Object obj);

    public static RustBuffer.ByValue A0Q(Object obj) {
        return FfiConverterString.INSTANCE.lower(obj.toString());
    }

    public static boolean A0U(HatchWhatsAppUiState hatchWhatsAppUiState, WhatsAppReplacePhase whatsAppReplacePhase, Object obj, BLG blg) {
        return blg.A6e(obj, HatchWhatsAppUiState.copy$default(hatchWhatsAppUiState, false, false, false, null, null, false, whatsAppReplacePhase, false, false, false, null, 1983, null));
    }

    public HtJ<Unit> create(HtJ<?> htJ) {
        throw C8j3.A18("create(Continuation) has not been overridden");
    }

    public GAu getCallerFrame() {
        HtJ<Object> htJ = this.completion;
        if (htJ instanceof GAu) {
            return (GAu) htJ;
        }
        return null;
    }

    public final HtJ<Object> getCompletion() {
        return this.completion;
    }

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.HtJ, X.HtJ<java.lang.Object>, java.lang.Object] */
    @Override // X.HtJ
    public final void resumeWith(Object obj) {
        while (true) {
            AbstractC8884Fsp abstractC8884Fsp = this;
            ?? r1 = abstractC8884Fsp.completion;
            C7384Etj.A0X(r1);
            try {
                obj = abstractC8884Fsp.invokeSuspend(obj);
                if (obj == EnumC10460Hji.A02) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C10571Hud(th);
            }
            abstractC8884Fsp.releaseIntercepted();
            if (!(r1 instanceof AbstractC8884Fsp)) {
                r1.resumeWith(obj);
                return;
            }
            this = r1;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sbA0x = C60O.A0x("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = C60Q.A0e(this);
        }
        return C8j3.A14(stackTraceElement, sbA0x);
    }

    public AbstractC8884Fsp(HtJ<Object> htJ) {
        this.completion = htJ;
    }

    public static void A0T(RustBuffer.ByValue byValue, UniffiRustCallStatus.Companion companion, G0U g0u, byte b) {
        g0u.invoke(companion.create(b, byValue));
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Integer num;
        Class<?> cls = getClass();
        DebugMetadata debugMetadata = (DebugMetadata) cls.getAnnotation(DebugMetadata.class);
        if (debugMetadata == null || debugMetadata.v() < 1) {
            return null;
        }
        int iIntValue = 0;
        try {
            Field declaredField = cls.getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                iIntValue = num.intValue();
            }
            i = iIntValue - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i < 0 ? -1 : debugMetadata.l()[i];
        C8886Fsr c8886Fsr = AbstractC8885Fsq.A00;
        if (c8886Fsr == null) {
            try {
                c8886Fsr = new C8886Fsr(Class.class.getDeclaredMethod("getModule", null), cls.getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), cls.getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC8885Fsq.A00 = c8886Fsr;
            } catch (Exception unused2) {
                c8886Fsr = AbstractC8885Fsq.A01;
                AbstractC8885Fsq.A00 = c8886Fsr;
            }
        }
        String str = null;
        if (c8886Fsr != AbstractC8885Fsq.A01 && (method = c8886Fsr.A01) != null && (objInvoke = method.invoke(cls, null)) != null && (method2 = c8886Fsr.A00) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = c8886Fsr.A02;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        return new StackTraceElement(str == null ? debugMetadata.c() : FGI.A0O(str, debugMetadata.c(), '/'), debugMetadata.m(), debugMetadata.f(), i2);
    }

    public HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        throw C8j3.A18("create(Any?;Continuation) has not been overridden");
    }
}
