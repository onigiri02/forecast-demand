作成した時期：令和6年6月<br>
所要時間：約　不明　時間<br>
協力者の有無：無し<br><br>

# forecast-demand
 通所している事業所で、利用者に提供するお弁当の需要の変動が大きいことと<br>
 在庫の保管場所が限られていることから在庫管理に苦慮しているという話を聞き、<br>
 Spring Bootの勉強を兼ねて需要予測の補助ができるツールを制作しました。<br>
 <br>
 過去の使用量等のデータがないため本格的な需要予測はできませんが<br>
 発注数と使用量、今後の使用量の見込みを入力すると今後の在庫推移の予想グラフが描画されます。
# 工夫した点
 グラフの表示にChart.jsを利用した。<br>
 今後の在庫量の変動をグラフ化することで一目でわかるようにした。
# 機能一覧
 使用量予測登録・修正・削除機能（グラフ表示もこの機能で行う）<br>
 使用量実績登録・修正・削除機能<br>
 発注情報登録・修正・削除機能
 
# 余裕があれば作る機能
 マスタ管理機能（営業日カレンダー、天気、最大在庫、最小在庫）

# さらに余裕があれば作る機能
 気象庁のCSVデータから天気情報取り込み
# 実装環境
バックエンド：Java(SpringBoot),MySQL<br>
フロントエンド：HTML,CSS(BootStrap),Thymeleaf,Chart.js
