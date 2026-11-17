package androidx.glance.appwidget;

import X.AbstractC7429Evm;
import X.AbstractC9266GBt;
import X.AnonymousClass796;
import X.BPp;
import X.C064476g;
import X.C07228ib;
import X.C77S;
import X.C79;
import X.C9359GFs;
import X.GBK;
import X.GF0;
import X.GG0;
import X.Hk0;
import X.HtJ;
import X.Hxb;
import android.content.Context;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class AsyncRequestWorker extends CoroutineWorker {
    public final C064476g A00;
    public final GBK A01;

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(HtJ<? super C77S> htJ) {
        return Hxb.A00(new C07228ib(this, (BPp) null, (HtJ<? super C07228ib>) 7), htJ);
    }

    @Override // androidx.work.CoroutineWorker
    public final GBK getCoroutineContext() {
        return this.A01;
    }

    public AsyncRequestWorker(Context context, WorkerParameters workerParameters) throws Throwable {
        byte[] bArr;
        InvalidProtocolBufferException e;
        super(context, workerParameters);
        GBK gbk = AbstractC9266GBt.A00;
        this.A01 = AbstractC7429Evm.A00;
        Object obj = workerParameters.A01.A00.get("request");
        if (obj instanceof Object[]) {
            try {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[Integer.valueOf(i).intValue()];
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
                    }
                    bArr[i] = ((Byte) obj2).byteValue();
                }
            } catch (ClassCastException unused) {
            }
        } else {
            bArr = null;
        }
        GF0 gf0 = C064476g.DEFAULT_INSTANCE;
        int length2 = bArr.length;
        AnonymousClass796 anonymousClass796A00 = AnonymousClass796.A00();
        if (length2 != 0) {
            gf0 = (GF0) gf0.A05(C79.A0K);
            try {
                GG0 gg0A00 = C9359GFs.A02.A00(gf0.getClass());
                gg0A00.AQe(new Hk0(anonymousClass796A00), gf0, bArr, 0, length2);
                gg0A00.AQ3(gf0);
            } catch (InvalidProtocolBufferException e2) {
                e = e2;
                if (e.wasThrownFromInputStream) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage(), e);
                    invalidProtocolBufferException.unfinishedMessage = null;
                    e = invalidProtocolBufferException;
                }
                e.unfinishedMessage = gf0;
                throw e;
            } catch (UninitializedMessageException e3) {
                e = new InvalidProtocolBufferException(e3.getMessage());
                e.unfinishedMessage = null;
                e.unfinishedMessage = gf0;
                throw e;
            } catch (IOException e4) {
                if (e4.getCause() instanceof InvalidProtocolBufferException) {
                    throw e4.getCause();
                }
                e = new InvalidProtocolBufferException(e4.getMessage(), e4);
                e.unfinishedMessage = null;
                e.unfinishedMessage = gf0;
                throw e;
            } catch (IndexOutOfBoundsException unused2) {
                e = InvalidProtocolBufferException.A01();
                e.unfinishedMessage = gf0;
                throw e;
            }
        }
        GF0.A02(gf0);
        this.A00 = (C064476g) gf0;
    }

    public static final GlanceAppWidgetReceiver A00(String str) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        if (objNewInstance instanceof GlanceAppWidgetReceiver) {
            return (GlanceAppWidgetReceiver) objNewInstance;
        }
        return null;
    }
}
