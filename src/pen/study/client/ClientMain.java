package pen.study.client;

import java.util.ArrayList;
import java.util.List;

import pen.study.core.Array2Stdout;
import pen.study.internal.util.Array2StringUtil;

/**
 * クライアント側想定のメインクラス
 * 
 * @author pentaro
 */
public class ClientMain {

    /**
     * 引数が標準出力される
     * 
     * @param args
     */
    public static void main(String[] args) {
	// リスト型に変換
	List<String> listArgs = new ArrayList<String>();

	// 詰めなおし
	for (String arg : args) {
	    // 引数の型をString配列にすればよかった
	    listArgs.add(arg);
	}

	// 呼び出し
	Array2Stdout.stdout(listArgs);

	// モジュールシステムが導入されるまでは、publicであれば呼び出せた
	//Array2StringUtil.array2String(listArgs);

    }

}
