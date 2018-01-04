module.exports = {
  entry: {
    concept: './concept.js', // array 가능
  },
  output: {
    path: '/Users/oscar/Personal/odolDev/webpack/concept',
    filename: '[name]-output.js',
    publicPath: '/', //서버상의 경로
    //publicPath: '/[hash]' // 컴파일마다 매번 hash값을 붙여 캐싱 핸들링 가능
    //publicPath: '/[chunkhash]' // 파일이 바뀔때만 hash값을 붙임
  },
  module: {
    rules: [/*{
        // babel-loader, babel-preset-react 등을 붙일 수 있음
    },*/ {
        test: /\.css$/,
        use: ['style', 'css'], // 여려개의 loader를 사용할 때는 use
        /*
        use: ExtractTextPlugin.extract({
        fallback: 'style', // 플러그인 실패 시 이 로더를 사용하겠다 
        use: 'css-loader'
      }),
        */
    }],
  },
  plugins: [
      /*
        new ExtractTextPlugin({
            filename: 'style-bundle.css',
        });
      */
  ],
  resolve: {
    modules: ['node_modules'], // node_modules 인식
    extensions: ['.js', '.css', '-loader'], // extensions 자동 인식
    /*alias: {
        'jquery': 'jquery/dist/jquery.min.js', // pre load 위치 지정
    }*/
  },
};
