* Activity Lifecycle
** 概要
Androidのアクティビティ動作確認用プロジェクト。
アクティビティはその状態に応じてコールバックメソッドが呼ばれ、それぞれの状態へと遷移する。
状態には以下の三つがある。
- Resumed
アクティビティが生成され、全面に表示されている状態。
ユーザーの入力を受け付ける。
- Paused
アクティビティが他アクティビティなどで部分的に隠されている状態
ユーザーの入力を受け付けず、コードを実行しない。
カメラなどのシステムリソースを使用している場合は、他のアクティビティで使用する可能性があるので解放する、
- Stopped
アクティビティが完全に隠され、バックグラウンドにある状態。
再開状態へと戻ることがあることを意識しなければならない。
アクティビティインスタンスやメンバー変数は保持される。
【Stoppedから再開状態へと遷移する状況の例】
    - Recent Appから他のアプリを起動し、元のアプリに戻る
    - アクティビティから他のアプリを起動し、戻るボタンで元のアプリに戻る
    - 電話などを受ける
- Destroyed
戻るボタンや画面の回転などでアクティビティが破棄された状態。
![アクティビティライフサイクル](https://developer.android.com/images/training/basics/basic-lifecycle.png )

** 学んだこと
*** シングルトン
*** onDestroy()での処理
メモリリークが発生する恐れのあるリソースの破棄などを行う。
例えば、シングルトンでグローバル変数のように扱っているものなど。
*** finish()メソッドを活用したアプリランチャーとしてのアクティビティの使用
