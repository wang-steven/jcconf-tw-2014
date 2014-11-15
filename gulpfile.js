var gulp = require('gulp'),
    plugins = require('gulp-load-plugins')();

gulp.task('default', ['watch']);

gulp.task('watch', function() {
    gulp.watch(['assets/**/*.*']).on('change', function(event) {
        gulp.src(event.path).pipe(plugins.connect.reload());
    });
});

gulp.task('serve', ['default'], function() {
    plugins.connect.server({
        root: 'assets',
        port: 8000,
        livereload: true
    });
    gulp.src('./assets/index.html')
        .pipe(plugins.open('', {
            url: 'http://localhost:8000'
        }));
});
